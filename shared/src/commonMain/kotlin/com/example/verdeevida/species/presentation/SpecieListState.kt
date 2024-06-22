package com.example.verdeevida.species.presentation

import com.example.verdeevida.species.domain.Specie

data class SpecieListState(
    val species: List<Specie> = emptyList(),
    val selectedSpecie: Specie? = null,
    val isSpecieSheetOpen: Boolean = false,
    val isSelectedSpecieSheetOpen: Boolean = false,
    val nameError: String? = null,
)
