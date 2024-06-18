package com.example.verdeevida.species.domain

data class Specie(
    val id: Int?,
    val name: String,
    val description: String,
    val photoBytes: ByteArray?
)
