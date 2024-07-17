package loymax.sdk.apis

import com.google.gson.annotations.SerializedName
import java.util.UUID

data class RegisterAnonymousRequest(
    @SerializedName("userIdentifier") val userIdentifier: UUID?,
    @SerializedName("password") val password: String?,
)
