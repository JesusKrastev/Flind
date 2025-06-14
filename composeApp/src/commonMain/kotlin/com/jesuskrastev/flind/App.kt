package com.jesuskrastev.flind

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jesuskrastev.flind.theme.FlindTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    FlindTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {

        }
    }
}