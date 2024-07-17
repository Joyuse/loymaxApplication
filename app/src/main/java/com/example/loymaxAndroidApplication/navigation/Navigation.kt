package com.example.loymaxAndroidApplication.navigation

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loymaxAndroidApplication.screens.MainScreen
import com.example.loymaxAndroidApplication.screens.OffersScreen
import com.example.loymaxAndroidApplication.viewModel.OffersViewModel
import com.example.loymaxAndroidApplication.viewModel.RegistrationViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MainScreen.route) {
        composable(route = AppScreens.MainScreen.route) {
            MainScreen(navController, RegistrationViewModel(application = Application()))
        }
        composable(route = AppScreens.OffersList.route) {
            OffersScreen(navController, OffersViewModel(application = Application()))
        }
    }
}