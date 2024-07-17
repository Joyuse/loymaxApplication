package com.example.saray.navigation.appBar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.example.saray.R
import kotlinx.coroutines.launch

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun AppBar(content: @Composable () -> Unit) {
//    val scope = rememberCoroutineScope()
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                colors = TopAppBarDefaults.smallTopAppBarColors(
//                    containerColor = colorResource(
//                        id = R.color.mainRed
//                    )
//                ),
//                title = {
//                    Text(
//                        color = Color.White,
//                        text = items[selectedItemIndex].title,
//                    )
//                },
//                navigationIcon = {
//                    IconButton(onClick = {
//                        scope.launch {
//                            drawerState.open()
//                        }
//                    }) {
//                        Icon(
//                            tint = Color.White,
//                            imageVector = Icons.Default.Menu,
//                            contentDescription = null
//                        )
//                    }
//                },
//                actions = {
//                    IconButton(onClick = {
//                        scope.launch {
//
//                        }
//                    }) {
//                        Icon(
//                            imageVector = Icons.Default.LocationOn,
//                            contentDescription = null
//                        )
//                    }
//                }
//            )
//        }
//    ) {
//        Column(
//            modifier = Modifier.padding(it)
//        ) {
//            content()
//        }
//    }
//}