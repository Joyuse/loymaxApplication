package apiService.filesApiService

import kotlinx.coroutines.flow.Flow
import loymax.sdk.models.ResultModelOfFileEdit
import loymax.sdk.models.ResultModelOfFileViewModel

interface FilesApiServiceHelper {

    fun fileGetFileByGuid(guid: String): Flow<Any>
}