package com.siddroid.holi.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.siddroid.holi.colors.MaterialColor

private val DarkColorPalette = darkColors(
    primary = MaterialColor.RED_200,
    primaryVariant = MaterialColor.RED_700,
    secondary = MaterialColor.YELLOW_200
)

private val LightColorPalette = lightColors(
    primary = MaterialColor.RED_500,
    primaryVariant = MaterialColor.RED_700,
    secondary = MaterialColor.YELLOW_200
)

@Composable
fun HoliTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        content = content
    )
}