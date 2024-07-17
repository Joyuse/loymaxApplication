package loymax.sdk.tokenManager

interface TokenStorage {
    fun saveToken(token: String)
    fun getToken(): String?
}