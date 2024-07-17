package com.example.loymaxAndroidApplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.loymaxAndroidApplication.navigation.AppScreens
import com.example.loymaxAndroidApplication.ui.theme.TestAddingSDKTheme
import com.example.loymaxAndroidApplication.viewModel.RegistrationViewModel
import kotlinx.coroutines.launch

@Composable
fun MainScreen(navController: NavHostController, registrationViewModel: RegistrationViewModel) {

    var buttonIsDisabled by remember {
        mutableStateOf(true)
    }

    TestAddingSDKTheme {
        Column(
            modifier = Modifier
                .imePadding()
                .safeContentPadding(),
        ) {
            Button(
                enabled = buttonIsDisabled,
                onClick = {
                    navController.navigate(AppScreens.OffersList.route)
                }) {
                Text("See Offers Screen")
            }
            Text("See Offers Screen")
        }
    }

    LaunchedEffect(key1 = null) {
        this.launch {
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestAddingSDKTheme {
        Greeting("Android")
    }
}