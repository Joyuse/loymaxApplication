package apiService.offersApiService

import android.app.Application
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import loymax.sdk.apis.OfferService
import loymax.sdk.infrastructure.ApiClient
import loymax.sdk.models.ResultModelOfOfferModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfOfferModel

class OffersApiService(application: Application): OffersApiServiceHelper {

    val apiClient = ApiClient()

    private val offerService = apiClient.createService(OfferService::class.java)

    override fun getOfferList(): Flow<ResultModelOfPagedViewModelOfOfferModel> = flow {
        emit(offerService.getListOffers())
    }

    override fun getCurrentOffer(offerId: Int): Flow<ResultModelOfOfferModel> = flow {
        emit(offerService.offerGetOffer(offerId))
    }
}