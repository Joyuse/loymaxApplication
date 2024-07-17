package apiService.registrationApiService

import kotlinx.coroutines.flow.Flow
import loymax.sdk.models.ResultModelOfAnonymousRegistrationResult
import loymax.sdk.models.ResultModelOfPagedViewModelOfOfferModel
import java.util.UUID

interface RegistrationApiServiceHelper {
    fun registrationAnonymousRegistration(
        userIdentifier: UUID?,
        password: String?,
    ): Flow<ResultModelOfAnonymousRegistrationResult>
}