package br.com.jones.library.core.features.images.network.service

import br.com.jones.library.core.features.images.models.Cat
import br.com.jones.library.core.features.images.network.dto.ImagesDTO
import retrofit2.http.Path
import retrofit2.http.Query

interface ImagesRemoteDataSource {

    suspend fun getCatImages(limit: Int, hasBreeds: Int): ArrayList<ImagesDTO>

    suspend fun getCatImageById(@Path("image_id") imageId: String): Cat

    suspend fun getCatImageById(
        @Path("image_id") imageId: String,
        @Query("sub_id") subId: String,
        @Query("size") size: Short,
        @Query("include_vote") includeVote: Boolean,
        @Query("include_favorites") includeFavorites: Boolean
    ): Cat
}