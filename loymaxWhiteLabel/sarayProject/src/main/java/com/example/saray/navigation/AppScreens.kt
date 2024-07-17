package com.example.saray.navigation

sealed class AppScreens(val route: String) {


    //TODO добавить для других аргементов, так же написать для передачи DTO
    fun withArgs(vararg args: Int): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }


    object MainScreen: AppScreens("main_screen")
    object OffersList: AppScreens("offers_screen")
    object RegistrationScreen: AppScreens("registration_screen")
    object CurrentOffer: AppScreens("current_offer")
}