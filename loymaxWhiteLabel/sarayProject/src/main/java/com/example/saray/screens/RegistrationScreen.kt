package com.example.saray.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.example.saray.navigation.AppScreens
import com.example.saray.viewModel.RegistrationViewModel
import kotlinx.coroutines.launch

@Composable
fun RegistrationScreen(
    navController: NavHostController,
    registrationViewModel: RegistrationViewModel
) {

    val coroutineScope = rememberCoroutineScope()
    val login = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    val screenState by registrationViewModel.screenState.collectAsState()

    if (screenState?.authToken != null) {
        screenState?.authToken?.let {  }
        navController.navigate(AppScreens.MainScreen.route)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
//            LoginView {
//                login.value = it
//            }
//            PasswordView {
//                password.value = it
//            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                enabled = true,
                onClick = {
                    coroutineScope.launch {
                        registrationViewModel.registrationAnonymousRegistration()
                    }
                }) {
                Text("Anonymous Registration")
            }
        }
    }
}

@Composable
private fun LoginView(
    onValueChange: (String) -> Unit,
) {
    val login = remember{mutableStateOf("")}
    TextField(
        value = login.value,
        textStyle = TextStyle(fontSize = 25.sp),
        onValueChange = { newText ->
            login.value = newText
            onValueChange(newText)
        },
        placeholder = {
            Text(text = "Login")
        }
    )
}

@Composable
private fun PasswordView(
    onValueChange: (String) -> Unit,
) {
    val password = remember{ mutableStateOf("") }
        TextField(
            value = password.value,
            textStyle = TextStyle(fontSize=25.sp),
            onValueChange = { newText ->
                password.value = newText
                onValueChange(newText)
            },
            placeholder = {
                Text(text = "Password")
            }
        )
}


@Preview(showBackground = true)
@Composable
fun RegistrationScreenPreview() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            LoginView {

            }
            PasswordView {

            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                enabled = true,
                onClick = {

                }) {
                Text("Registration")
            }
        }
    }
}