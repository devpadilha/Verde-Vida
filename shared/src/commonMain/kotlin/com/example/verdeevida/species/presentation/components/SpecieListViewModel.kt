package com.example.verdeevida.species.presentation.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.verdeevida.species.domain.Specie
import com.example.verdeevida.species.presentation.SpecieListEvent
import com.example.verdeevida.species.presentation.SpecieListState
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SpecieListViewModel: ViewModel() {
    private val _state = MutableStateFlow(SpecieListState(
        species = species
    ))
    val state = _state.asStateFlow()
    var newSpecie: Specie? by mutableStateOf(null)
    private set

    fun onEvent(event: SpecieListEvent) {

    }
}

private val species = (1..10).map {
    Specie(
        id = it,
        name = "Nome $it",
        scientificName = "Nome Cientifico $it",
        description = "Description $it",
        photoBytes = null
    )
}