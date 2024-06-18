package com.example.verdeevida.species.presentation

import com.example.verdeevida.species.domain.Specie

sealed interface SpecieListEvent {
    object OnAddNewSpecie: SpecieListEvent
    object DismissSpecies: SpecieListEvent
    data class OnNameChanged(val value: String): SpecieListEvent
    class OnPhotoPicked(val bytes: ByteArray): SpecieListEvent
    object OnAddPhotoClicked: SpecieListEvent
    object SaveSpecie: SpecieListEvent
    data class SelectSpecie(val specie: Specie): SpecieListEvent
    data class EditSpecie(val specie: Specie): SpecieListEvent
    object DeleteSpecie: SpecieListEvent
}