package loymax.sdk.infrastructure

import okhttp3.Interceptor
import okhttp3.Response
import okio.IOException

class ErrorInterceptor : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val response = chain.proceed(request)

        if (!response.isSuccessful) {
            when (response.code) {
                401 -> {
                    // Handle 401 Unauthorized
                    throw IOException("Unauthorized: Please check your credentials.")
                }
                403 -> {
                    // Handle 403 Forbidden
                    throw IOException("Forbidden: You don't have permission to access this resource.")
                }
                // Add other status codes as needed
                else -> {
                    throw IOException("HTTP error code: ${response.code}")
                }
            }
        }

        return response
    }
}