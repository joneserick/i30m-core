package br.com.jones.library.core.features.images.network.dto

import br.com.jones.library.core.features.breed.models.Breed
import br.com.jones.library.core.features.category.models.Category

data class ImagesDTO(
    val breeds: ArrayList<Breed>,
    val categories: ArrayList<Category>,
    val id: String,
    val url: String
)


