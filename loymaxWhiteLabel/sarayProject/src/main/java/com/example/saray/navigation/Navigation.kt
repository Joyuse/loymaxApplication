package com.example.saray.navigation

import android.app.Application
import android.os.Build
import androidx.activity.compose.BackHandler
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.saray.screens.CurrentOfferScreen
import com.example.saray.screens.MainScreen
import com.example.saray.screens.OffersScreen
import com.example.saray.screens.RegistrationScreen
import com.example.saray.viewModel.MainViewModel
import com.example.saray.viewModel.OffersViewModel
import com.example.saray.viewModel.RegistrationViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation() {
    val navController = rememberNavController()
//    HandleBackPress(navController)
    NavHost(navController = navController, startDestination = AppScreens.RegistrationScreen.route) {
        composable(route = AppScreens.RegistrationScreen.route) {
            RegistrationScreen(navController, RegistrationViewModel(application = Application()))
        }
        composable(route = AppScreens.MainScreen.route) {
            MainScreen(navController, MainViewModel(application = Application()))
        }
        composable(route = AppScreens.OffersList.route) {
            OffersScreen(navController, OffersViewModel(application = Application()))
        }
        composable(
            route = AppScreens.CurrentOffer.route + "/{currentOfferId}",
            arguments = listOf(
                navArgument("currentOfferId") {
                    type = NavType.IntType
                    defaultValue = 0
                    nullable = false
                }
            )
        ) {entry ->
            CurrentOfferScreen(
                navController,
                OffersViewModel(application = Application()),
                currentOfferId = entry.arguments?.getInt("currentOfferId"),
                onBack = {
                    navController.popBackStack()
                },
            )
        }
    }
}

//@Composable
//fun HandleBackPress(navController: NavHostController) {
//    val backStackEntry = navController.currentBackStackEntryAsState()
//    backStackEntry.value?.let {
//        val canPop = navController.previousBackStackEntry != null
//        val backPressedDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
//        BackHandler(enabled = canPop) {
//            backPressedDispatcher?.onBackPressed()
//        }
//    }
//}