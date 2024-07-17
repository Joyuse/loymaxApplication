package com.example.loymaxAndroidApplication.modules

import apiService.filesApiService.FileStorageApiService
import apiService.imagesApiService.ImagesApiService
import apiService.offersApiService.OffersApiService
import org.koin.dsl.module

fun getRepositoriesModule() = module {
    single<OffersApiService> { OffersApiService(get()) }
    single<ImagesApiService> { ImagesApiService(get()) }
    single<FileStorageApiService> { FileStorageApiService(get()) }
}