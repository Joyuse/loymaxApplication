package com.example.saray.navigation.navigationDrawer

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val badgeCount: Int? = null,
    val id: NavigationMenuId,
)

enum class NavigationMenuId {
    EVENT, SIGIN, SHOPPING_LIST, SHOPS, NOTIFICATIONS, SUPPORT, ABOUT,
}
