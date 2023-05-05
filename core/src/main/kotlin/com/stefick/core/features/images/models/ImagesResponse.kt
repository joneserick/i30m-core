package com.stefick.core.features.images.models

import br.com.stefick.i30m.features.breed.models.Breed
import com.stefick.core.features.category.models.Category

data class ImagesResponse(
    val breeds: ArrayList<Breed>,
    val categories: ArrayList<Category>,
    val id: String,
    val url: String
)


