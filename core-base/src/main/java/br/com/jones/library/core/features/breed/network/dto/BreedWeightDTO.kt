package br.com.jones.library.core.features.breed.network.dto

import com.google.gson.annotations.SerializedName

data class BreedWeightDTO(
    @SerializedName("imperial") val imperial: String,
    @SerializedName("metric") val metric: String
)