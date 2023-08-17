package br.com.jones.library.core.features.breed.network.repository

import br.com.jones.library.core.features.breed.models.Breed
import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Path

internal interface IBreedRepository {
    suspend fun getBreeds(limit: Int, page: Int): Flow<List<Breed>>
    suspend fun getBreed(@Path("id") breedId: Int): Flow<Breed>
}
