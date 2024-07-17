package loymax.sdk.apis

import com.google.gson.annotations.SerializedName
import java.util.UUID

data class FileRequestId(
    @SerializedName("id") val id: Int?,
)

data class FileRequestGuid(
    @SerializedName("guid") val guid: String?,
)
