package com.jesuskrastev.flind

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jesuskrastev.flind.core.theme.FlindTheme
import com.jesuskrastev.flind.features.components.BottomNavigationBar
import com.jesuskrastev.flind.features.explore.presentation.ExploreScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    FlindTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                bottomBar = {
                    BottomNavigationBar()
                }
            ) {
                ExploreScreen()
            }
        }
    }
}