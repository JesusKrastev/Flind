package com.jesuskrastev.flind.features.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Inbox
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Inbox
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
) {
    var selectedPage by remember { mutableStateOf(0) }

    @Immutable
    data class NavigationItem(
        val unselectedIcon: ImageVector,
        val selectedIcon: ImageVector,
        val title: String,
        val onClick: () -> Unit
    )

    val items: List<NavigationItem> = listOf(
        NavigationItem(
            selectedIcon = Icons.Filled.Search,
            unselectedIcon = Icons.Outlined.Search,
            title = "Explore",
            onClick = {}
        ),
        NavigationItem(
            selectedIcon = Icons.Filled.Favorite,
            unselectedIcon = Icons.Outlined.FavoriteBorder,
            title = "Saved",
            onClick = {}
        ),
        NavigationItem(
            selectedIcon = Icons.Filled.Inbox,
            unselectedIcon = Icons.Outlined.Inbox,
            title = "Inbox",
            onClick = {}
        ),
        NavigationItem(
            selectedIcon = Icons.Filled.AccountCircle,
            unselectedIcon = Icons.Outlined.AccountCircle,
            title = "Profile",
            onClick = {}
        ),
    )

    NavigationBar(
        modifier = modifier,
    ) {
        items.forEachIndexed { index, item ->
            val selected = selectedPage == index

            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = if(selected) item.selectedIcon else item.unselectedIcon,
                        contentDescription = item.title,
                    )
                },
                label = {
                    Text(
                        text = item.title
                    )
                },
                selected = selected,
                onClick = {
                    selectedPage = index
                },
            )
        }
    }
}