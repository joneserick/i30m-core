package com.stefick.core.features.images.network.dto

import com.stefick.core.features.breed.models.Breed
import com.stefick.core.features.category.models.Category

data class ImagesDTO(
    val breeds: ArrayList<Breed>,
    val categories: ArrayList<Category>,
    val id: String,
    val url: String
)


