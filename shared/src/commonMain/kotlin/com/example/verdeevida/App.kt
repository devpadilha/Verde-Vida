package com.example.verdeevida

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.verdeevida.core.presentation.SpeciesTheme
import com.example.verdeevida.species.presentation.SpecieListScreen
import com.example.verdeevida.species.presentation.components.SpecieListViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    SpeciesTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        val viewModel = getViewModel(
            key = "specie-list-screen",
            factory = viewModelFactory {
                SpecieListViewModel()
            }
        )
        val state by viewModel.state.collectAsState()
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            SpecieListScreen(
                state = state,
                newSpecie = viewModel.newSpecie,
                onEvent = viewModel::onEvent
            )
        }
    }
}