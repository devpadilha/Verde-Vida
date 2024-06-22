package com.example.verdeevida.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asComposeImageBitmap
import com.example.verdeevida.ui.theme.DarkColorScheme
import com.example.verdeevida.ui.theme.LightColorScheme
import com.example.verdeevida.ui.theme.Typography
import org.jetbrains.skia.Bitmap
import org.jetbrains.skia.Image

@Composable
actual fun SpeciesTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if(darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}