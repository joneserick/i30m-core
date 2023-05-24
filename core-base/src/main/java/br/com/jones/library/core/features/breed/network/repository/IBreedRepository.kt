package br.com.jones.library.core.features.breed.network.repository

import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Path

internal interface IBreedRepository {
    suspend fun getBreeds(limit: Int, page: Int): Flow<ArrayList<br.com.jones.library.core.features.breed.network.dto.BreedDTO>>
    suspend fun getBreed(@Path("id") breedId: Int): Flow<br.com.jones.library.core.features.breed.network.dto.BreedDTO>
}
