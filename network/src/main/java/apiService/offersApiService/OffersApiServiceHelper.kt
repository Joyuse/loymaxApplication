package apiService.offersApiService

import kotlinx.coroutines.flow.Flow
import loymax.sdk.models.Result
import loymax.sdk.models.ResultModelOfOfferModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfOfferModel
import retrofit2.Response

interface OffersApiServiceHelper {
    fun getOfferList(): Flow<ResultModelOfPagedViewModelOfOfferModel>

    fun getCurrentOffer(offerId: Int): Flow<ResultModelOfOfferModel>

}