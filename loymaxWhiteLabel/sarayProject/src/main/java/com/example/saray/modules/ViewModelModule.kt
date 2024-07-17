package com.example.saray.modules


import com.example.saray.viewModel.MainViewModel
import com.example.saray.viewModel.OffersViewModel
import com.example.saray.viewModel.RegistrationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun getViewModelModule() = module {
    viewModel { RegistrationViewModel(get()) }
    viewModel { OffersViewModel(get()) }
    viewModel { MainViewModel(get()) }
}