package com.example.loymaxAndroidApplication.app

import android.app.Application
import com.example.loymaxAndroidApplication.modules.getRepositoriesModule
import com.example.loymaxAndroidApplication.modules.getViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class LoymaxApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(
                listOf(
                    getViewModelModule(),
                    getRepositoriesModule(),
//                    getApiModule(
//                        authURL = "https://mapp.guildmail.ru/authorizationService/",
//                        baseURL = "https://mapp.guildmail.ru/publicapi/",
//                        offersURL = "https://xn--80apijcrh7b9d.xn--p1ai/"
//                    )
                )
            )
        }
    }
}