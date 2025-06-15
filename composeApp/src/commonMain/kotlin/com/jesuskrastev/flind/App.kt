package com.jesuskrastev.flind

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.jesuskrastev.flind.core.theme.FlindTheme
import com.jesuskrastev.flind.features.components.BottomNavigationBar
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

            }
        }
    }
}