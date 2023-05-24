package br.com.jones.library.core.features.images.models

import br.com.jones.library.core.features.breed.models.Breed
import br.com.jones.library.core.features.category.models.Category
import com.google.gson.annotations.SerializedName

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