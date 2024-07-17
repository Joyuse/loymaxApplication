package com.example.loymaxAndroidApplication.modules


import com.example.loymaxAndroidApplication.viewModel.OffersViewModel
import com.example.loymaxAndroidApplication.viewModel.RegistrationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun getViewModelModule() = module {
    viewModel { RegistrationViewModel(get()) }
    viewModel { OffersViewModel(get()) }
}