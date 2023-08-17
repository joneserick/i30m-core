package br.com.jones.library.core.features.breed.network

import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BreedApi {

    @GET("breeds")
    suspend fun getBreeds(
        @Query("limit") limit: Int,
        @Query("page") page: Int
    ): List<BreedDTO>

    @GET("breeds/{id}")
    suspend fun getBreed(@Path("id") breedId: Int): BreedDTO
}