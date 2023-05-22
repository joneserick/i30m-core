package com.stefick.core.features.images.network

import com.stefick.core.features.images.models.Cat
import com.stefick.core.features.images.network.dto.ImagesDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ImagesApi {

    @GET("images/search")
    suspend fun getCatImages(
        @Query("limit") limit: Int,
        @Query("has_breeds") hasBreeds: Int
    ): ArrayList<ImagesDTO>

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