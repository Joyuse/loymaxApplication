package loymax.sdk.infrastructure


import com.squareup.moshi.Moshi
import loymax.sdk.tokenManager.TokenManager
import okhttp3.Call
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class ApiClient(
    private var baseUrl: String = defaultBasePath,
    private val okHttpClientBuilder: OkHttpClient.Builder? = null,
    private val serializerBuilder: Moshi.Builder = Serializer.moshiBuilder,
    private val callFactory : Call.Factory? = null,
    private val converterFactory: Converter.Factory? = null,
) {
    private val apiAuthorizations = mutableMapOf<String, Interceptor>()

    var logger: ((String) -> Unit)? = null

    private val bearerToken: String? = TokenManager.bearerToken

    private val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create(serializerBuilder.build()))
            .apply {
                if (converterFactory != null) {
                    addConverterFactory(converterFactory)
                }
            }
    }

    private val clientBuilder: OkHttpClient.Builder by lazy {
        okHttpClientBuilder ?: defaultClientBuilder
    }

    private val defaultClientBuilder: OkHttpClient.Builder by lazy {
        OkHttpClient()
            .newBuilder()
            .addInterceptor(
                provideLoggingInterceptor()
            )
            .addInterceptor(ErrorInterceptor())
            .addInterceptor { chain ->
                val requestBuilder = chain.request().newBuilder()
                bearerToken?.let {
                    requestBuilder.addHeader("www-authenticate", "Bearer $it")
                }
                chain.proceed(requestBuilder.build())
            }
    }

    private fun provideLoggingInterceptor() : HttpLoggingInterceptor {
        val logInterceptor = HttpLoggingInterceptor()
        logInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return logInterceptor
    }

    init {
        normalizeBaseUrl()
    }

    /**
     * Adds an authorization to be used by the client
     * @param authName Authentication name
     * @param authorization Authorization interceptor
     * @return ApiClient
     */
    fun addAuthorization(authName: String, authorization: Interceptor): ApiClient {
        if (apiAuthorizations.containsKey(authName)) {
            throw RuntimeException("auth name $authName already in api authorizations")
        }
        apiAuthorizations[authName] = authorization
        clientBuilder.addInterceptor(authorization)
        return this
    }

    fun setLogger(logger: (String) -> Unit): ApiClient {
        this.logger = logger
        return this
    }

    fun <S> createService(serviceClass: Class<S>): S {
        val usedCallFactory = this.callFactory ?: clientBuilder.build()
        return retrofitBuilder.callFactory(usedCallFactory).build().create(serviceClass)
    }

    private fun normalizeBaseUrl() {
        if (!baseUrl.endsWith("/")) {
            baseUrl += "/"
        }
    }

    private inline fun <T, reified U> Iterable<T>.runOnFirst(callback: U.() -> Unit) {
        for (element in this) {
            if (element is U)  {
                callback.invoke(element)
                break
            }
        }
    }

    companion object {
        @JvmStatic
        protected val baseUrlKey = "loymax.sdk.baseUrl"

        @JvmStatic
        val defaultBasePath: String by lazy {
                System.getProperties().getProperty(baseUrlKey, "https://demo.loymax.tech/publicapi/")
        }
    }
}
