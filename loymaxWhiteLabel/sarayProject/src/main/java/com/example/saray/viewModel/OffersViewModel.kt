package com.example.saray.viewModel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import apiService.filesApiService.FileStorageApiService
import apiService.offersApiService.OffersApiService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import loymax.sdk.models.OfferModel
import okio.IOException
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import uiState.UIState

class OffersViewModel(application: Application) : ViewModel(), KoinComponent {
    private val offersApiService: OffersApiService by inject()
    private val fileStorageApiService: FileStorageApiService by inject()

    private var _stateOffers = MutableStateFlow<MutableList<OfferModel>?>(null)
    var stateOffers = _stateOffers

    private var _stateCurrentOffer = MutableStateFlow<OfferModel?>(null)
    var stateCurrentOffer = _stateCurrentOffer

    private val _uiState = MutableStateFlow<UIState>(UIState.Idle)
    val uiState: StateFlow<UIState> = _uiState

    suspend fun getOffersList() {
        viewModelScope.launch {
            _uiState.value = UIState.Loading
            try {
                offersApiService.getOfferList().collect { result ->
                    result.data?.let { offersList ->
                        _uiState.value = UIState.Success
                        _stateOffers.emit(offersList)
                    }
                }
            } catch (e: IOException) {
                _uiState.value = UIState.Error(e.message ?: "Unknown Error")
            }

        }
    }

    suspend fun getCurrentOffer(offerId: Int) {
        viewModelScope.launch {
            _uiState.value = UIState.Loading
            try {
                offersApiService.getCurrentOffer(offerId).collect { result ->
                    result.data?.let { offerData ->
                        _uiState.value = UIState.Success
                        _stateCurrentOffer.emit(offerData)
                    }
                }
            } catch (e: IOException) {
                _uiState.value = UIState.Error(e.message ?: "Unknown Error")
            }
        }
    }

    fun getImageWithGuid(uidFile: String) = fileStorageApiService.getFilesUrl(uidFile)
}