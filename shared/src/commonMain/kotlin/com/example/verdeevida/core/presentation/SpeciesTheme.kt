package com.example.verdeevida.core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun SpeciesTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)