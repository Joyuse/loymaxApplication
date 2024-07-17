package com.example.saray.screens

import android.app.Application
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.saray.navigation.navigationDrawer.NavigationDrawer
import com.example.saray.ui.theme.TestAddingSDKTheme
import com.example.saray.viewModel.MainViewModel
import com.example.saray.viewModel.OffersViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MainScreen(navController: NavHostController, mainViewModel: MainViewModel) {
    OffersScreen(navController, OffersViewModel(application = Application()))
    NavigationDrawer(navController) {
        OffersScreen(navController, OffersViewModel(application = Application()))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestAddingSDKTheme {

    }
}