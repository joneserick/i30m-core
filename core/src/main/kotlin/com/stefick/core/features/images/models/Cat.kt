package com.stefick.core.features.images.models

import br.com.stefick.i30m.features.breed.models.Breed
import com.google.gson.annotations.SerializedName
import com.stefick.core.features.category.models.Category

data class Cat(
    val id: String,
    val url: String?,
    val width: Short? = 0,
    val height: Short? = 0,
    @SerializedName("mime_type") val mimeType: String = "",
    val breeds: ArrayList<Breed>?,
    val categories: ArrayList<Category>?,
    @SerializedName("breed_ids") val breedIds: String = ""
)