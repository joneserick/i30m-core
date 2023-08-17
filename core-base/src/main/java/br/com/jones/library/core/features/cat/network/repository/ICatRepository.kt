package br.com.jones.library.core.features.cat.network.repository

import br.com.jones.library.core.features.cat.models.Cat
import br.com.jones.library.core.features.cat.network.dto.CatDTO
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Path
import retrofit2.http.Query

interface ICatRepository {

    suspend fun getCatImages(limit: Int, hasBreeds: Int): Flow<List<CatDTO>>

    suspend fun getCatImageById(@Path("image_id") imageId: String): Flow<Cat>

    suspend fun getCatImageById(
        @Path("image_id") imageId: String,
        @Query("sub_id") subId: String,
        @Query("size") size: Short,
        @Query("include_vote") includeVote: Boolean,
        @Query("include_favorites") includeFavorites: Boolean
    ): Flow<Cat>
}