package apiService.imagesApiService

import kotlinx.coroutines.flow.Flow
import loymax.sdk.models.Result
import loymax.sdk.models.ResultModelOfFileViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfOfferModel
import retrofit2.Response

interface ImagesApiServiceHelper {
    fun getImage(imageId: String): Flow<ResultModelOfFileViewModel>

    fun getLogo(): Flow<ResultModelOfFileViewModel>
}