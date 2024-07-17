package com.example.loymaxAndroidApplication.navigation

sealed class AppScreens(val route: String) {
    object MainScreen: AppScreens("main_screen")
    object OffersList: AppScreens("offers_screen")
}