package apiService.registrationApiService

import android.app.Application
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import loymax.sdk.apis.OfferService
import loymax.sdk.apis.RegisterAnonymousRequest
import loymax.sdk.apis.RegistrationService
import loymax.sdk.infrastructure.ApiClient
import loymax.sdk.models.ResultModelOfAnonymousRegistrationResult
import loymax.sdk.models.ResultModelOfPagedViewModelOfOfferModel
import java.util.UUID

class RegistrationApiService(application: Application): RegistrationApiServiceHelper {

    val apiClient = ApiClient()

    private val registrationService = apiClient.createService(RegistrationService::class.java)

    override fun registrationAnonymousRegistration(
        userIdentifier: UUID?,
        password: String?,
    ): Flow<ResultModelOfAnonymousRegistrationResult> = flow {
        emit(registrationService.registrationRegisterAnonymous(
            RegisterAnonymousRequest(
                userIdentifier,
                password,
            )
        ))
    }
}