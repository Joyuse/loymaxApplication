package apiService.filesApiService

import android.app.Application
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import loymax.sdk.apis.FileService
import loymax.sdk.apis.FileStorageService
import loymax.sdk.infrastructure.ApiClient
import loymax.sdk.models.ResultModelOfFileEdit

class FileStorageApiService(application: Application): FilesApiServiceHelper {

    private val fileStorageService = ApiClient().createService(FileStorageService::class.java)

    override fun fileGetFileByGuid(guid: String): Flow<Any> = flow {
        emit(fileStorageService.fileStorageGet(uid = guid))
    }

    fun getFilesUrl(uidFile: String) = ApiClient.defaultBasePath + "v1/Files/" + uidFile

}