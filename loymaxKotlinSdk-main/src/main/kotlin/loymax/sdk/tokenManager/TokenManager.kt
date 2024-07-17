package loymax.sdk.tokenManager

object TokenManager {
    private lateinit var tokenStorage: TokenStorage

    fun init(storage: TokenStorage) {
        tokenStorage = storage
    }

    var bearerToken: String?
        get() = tokenStorage.getToken()
        set(token) {
            if (token != null) {
                tokenStorage.saveToken(token)
            }
        }
}