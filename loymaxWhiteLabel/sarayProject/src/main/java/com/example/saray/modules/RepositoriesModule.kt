package com.example.saray.modules

import apiService.filesApiService.FileStorageApiService
import apiService.imagesApiService.ImagesApiService
import apiService.offersApiService.OffersApiService
import apiService.registrationApiService.RegistrationApiService
import org.koin.dsl.module

fun getRepositoriesModule() = module {
    single<RegistrationApiService> { RegistrationApiService(get()) }
    single<OffersApiService> { OffersApiService(get()) }
    single<ImagesApiService> { ImagesApiService(get()) }
    single<FileStorageApiService> { FileStorageApiService(get()) }

}