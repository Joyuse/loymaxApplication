package com.example.saray.navigation.navigationDrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.saray.R
import com.example.saray.navigation.AppScreens
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawer(navController: NavHostController, content: @Composable () -> Unit) {
    //TODO перенести NavigationDrawer в composeComponents
    //TODO вынести items в отдельный класс
    //TODO Добавить возможность скрытия ModalNavigationDrawer и оставить только AppBar
    val items = listOf(
        NavigationItem(
            title = stringResource(id = R.string.menu_item_event),
            selectedIcon = Icons.Filled.ThumbUp,
            unselectedIcon = Icons.Outlined.ThumbUp,
            id = NavigationMenuId.EVENT,
        ),
        NavigationItem(
            title = stringResource(id = R.string.menu_item_sign_in),
            selectedIcon = Icons.Filled.ExitToApp,
            unselectedIcon = Icons.Outlined.ExitToApp,
            id = NavigationMenuId.SIGIN,
        ),
        NavigationItem(
            title = stringResource(id = R.string.menu_item_shopping_list),
            selectedIcon = Icons.Filled.ShoppingCart,
            unselectedIcon = Icons.Outlined.ShoppingCart,
            id = NavigationMenuId.SHOPPING_LIST,
        ),
        NavigationItem(
            title = stringResource(id = R.string.menu_item_shops),
            selectedIcon = Icons.Filled.ShoppingCart,
            unselectedIcon = Icons.Outlined.ShoppingCart,
            id = NavigationMenuId.SHOPS,
        ),
        NavigationItem(
            title = stringResource(id = R.string.menu_item_notifications),
            selectedIcon = Icons.Filled.Notifications,
            unselectedIcon = Icons.Outlined.Notifications,
            id = NavigationMenuId.NOTIFICATIONS,
        ),
        NavigationItem(
            title = stringResource(id = R.string.menu_item_support),
            selectedIcon = Icons.Filled.Phone,
            unselectedIcon = Icons.Outlined.Phone,
            id = NavigationMenuId.SUPPORT,
        ),
        NavigationItem(
            title = stringResource(id = R.string.menu_item_about),
            selectedIcon = Icons.Filled.Info,
            unselectedIcon = Icons.Outlined.Info,
            id = NavigationMenuId.ABOUT,
        ),
    )
    // TODO закомнить selectedItemIndex для всех экранов
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()
        var selectedItemIndex by rememberSaveable {
            mutableIntStateOf(0)
        }
        ModalNavigationDrawer(
            drawerContent = {
                ModalDrawerSheet(
                    modifier = Modifier.requiredWidth(280.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    items.forEachIndexed { index, item ->
                        NavigationDrawerItem(
                            label = {
                                Text(text = item.title)
                            },
                            selected = index == selectedItemIndex,
                            onClick = {
                                selectedItemIndex = index
                                scope.launch {
                                    drawerState.close()
                                }
                                when (item.id) {
                                    NavigationMenuId.EVENT -> {
                                        if (selectedItemIndex != index) {
                                            navController.navigate(AppScreens.OffersList.route)
                                        }
                                    }

                                    NavigationMenuId.SIGIN -> {

                                    }

                                    NavigationMenuId.SHOPPING_LIST -> {

                                    }

                                    NavigationMenuId.SHOPS -> {

                                    }

                                    NavigationMenuId.NOTIFICATIONS -> {

                                    }

                                    NavigationMenuId.SUPPORT -> {

                                    }

                                    NavigationMenuId.ABOUT -> {

                                    }
                                }
                            },
                            icon = {
                                Icon(
                                    imageVector = if (index == selectedItemIndex) {
                                        item.selectedIcon
                                    } else item.unselectedIcon,
                                    contentDescription = item.title
                                )
                            },
                            badge = {
                                item.badgeCount?.let {
                                    Text(text = item.badgeCount.toString())
                                }
                            },
                            modifier = Modifier
                                .padding(NavigationDrawerItemDefaults.ItemPadding)
                        )
                    }
                }
            },
            drawerState = drawerState
        ) {
            Scaffold(
                topBar = {
                    TopAppBar(
                        colors = TopAppBarDefaults.smallTopAppBarColors(
                            containerColor = colorResource(
                                id = R.color.mainRed
                            )
                        ),
                        title = {
                            Text(
                                color = Color.White,
                                text = items[selectedItemIndex].title,
                            )
                        },
                        navigationIcon = {
                            IconButton(onClick = {
                                scope.launch {
                                    drawerState.open()
                                }
                            }) {
                                Icon(
                                    tint = Color.White,
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = null
                                )
                            }
                        },
                        actions = {
                            IconButton(onClick = {
                                scope.launch {

                                }
                            }) {
                                Icon(
                                    imageVector = Icons.Default.LocationOn,
                                    contentDescription = null
                                )
                            }
                        }
                    )
                }
            ) {
                Column(
                    modifier = Modifier.padding(it)
                ) {
                    content()
                }
            }
        }
    }
}