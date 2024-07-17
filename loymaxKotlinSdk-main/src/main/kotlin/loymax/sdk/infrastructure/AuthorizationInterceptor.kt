package loymax.sdk.infrastructure

import okhttp3.Interceptor
import okhttp3.Response

class AuthorizationInterceptor(private val tokenProvider: () -> String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val requestBuilder = original.newBuilder()
            .header("Authorization", tokenProvider())
        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}