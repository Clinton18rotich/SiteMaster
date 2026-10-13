package com.clinton.sitemaster.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Primary,
    onPrimary = Color.Black,
    secondary = Secondary,
    background = DarkBackground,
    surface = DarkSurface,
    error = Error,
    onBackground = TextPrimary,
    onSurface = TextPrimary
)

@Composable
fun SiteMasterTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
