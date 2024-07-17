package com.example.saray.app

import android.app.Application
import com.example.saray.modules.getRepositoriesModule
import com.example.saray.modules.getViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import loymax.sdk.tokenManager.TokenManager

class LoymaxApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        val tokenStorage = SharedPreferencesTokenStorage(this)
        TokenManager.init(tokenStorage)
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