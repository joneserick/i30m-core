package br.com.jones.library.core.features.cat.network.dto

import br.com.jones.library.core.features.breed.models.Breed
import br.com.jones.library.core.features.category.models.Category

data class CatDTO(
    val breeds: List<Breed>,
    val categories: List<Category>,
    val mimeType: String,
    val id: String,
    val url: String
)


