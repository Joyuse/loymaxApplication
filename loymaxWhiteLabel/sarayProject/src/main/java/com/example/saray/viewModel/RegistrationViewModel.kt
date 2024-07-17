package com.example.saray.viewModel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import apiService.offersApiService.OffersApiService
import apiService.registrationApiService.RegistrationApiService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import loymax.sdk.models.AnonymousRegistrationResult
import loymax.sdk.models.OfferModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import uiState.UIState
import java.io.IOException
import java.util.UUID

class RegistrationViewModel(application: Application) : ViewModel(), KoinComponent {

    private val registrationApiService: RegistrationApiService by inject()

    private var _screenState = MutableStateFlow<AnonymousRegistrationResult?>(null)
    var screenState = _screenState

    suspend fun registrationAnonymousRegistration() {
        viewModelScope.launch {
            try {
                registrationApiService.registrationAnonymousRegistration(
                    UUID.randomUUID(), "123"
                ).collect { result ->
                    result.data?.let { result ->
                        _screenState.emit(result)
                    }
                }
            } catch (e: IOException) {

            }
        }
    }
}