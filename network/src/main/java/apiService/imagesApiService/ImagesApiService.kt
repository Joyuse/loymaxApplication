package apiService.imagesApiService

import android.app.Application
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import loymax.sdk.apis.ImageService
import loymax.sdk.infrastructure.ApiClient
import loymax.sdk.models.ResultModelOfFileViewModel

class ImagesApiService(application: Application): ImagesApiServiceHelper {

    private val imageService = ApiClient().createService(ImageService::class.java)

    override fun getImage(imageId: String): Flow<ResultModelOfFileViewModel>  = flow {
        emit(imageService.imageGetImage(imageId = imageId))
    }

    override fun getLogo(): Flow<ResultModelOfFileViewModel> = flow {
        emit(imageService.imageGetLogo())
    }
}