package br.com.jones.library.core.features.cat.network

import br.com.jones.library.core.features.cat.models.Cat
import br.com.jones.library.core.features.cat.network.dto.CatDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CatApi {

    @GET("images/search")
    suspend fun getCatImages(
        @Query("limit") limit: Int,
        @Query("has_breeds") hasBreeds: Int
    ): List<CatDTO>

    @GET("images/{image_id}")
    suspend fun getCatImageById(@Path("image_id") imageId: String): Cat

    @GET("images/{image_id}")
    suspend fun getCatImageById(
        @Path("image_id") imageId: String,
        @Query("sub_id") subId: String,
        @Query("size") size: Short,
        @Query("include_vote") includeVote: Boolean,
        @Query("include_favorites") includeFavorites: Boolean
    ): Cat
}