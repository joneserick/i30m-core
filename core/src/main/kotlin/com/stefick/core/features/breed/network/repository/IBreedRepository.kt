package com.stefick.core.features.breed.network.repository

import com.stefick.core.features.breed.network.dto.BreedDTO
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Path

internal interface IBreedRepository {
    suspend fun getBreeds(limit: Int, page: Int): Flow<ArrayList<BreedDTO>>
    suspend fun getBreed(@Path("id") breedId: Int): Flow<BreedDTO>
}
