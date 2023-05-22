package com.stefick.core.features.breed.network

import com.stefick.core.features.breed.network.dto.BreedDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BreedApi {

    @GET("breeds")
    suspend fun getBreeds(@Query("limit") limit: Int, @Query("page") page: Int): ArrayList<BreedDTO>

    @GET("breeds/{id}")
    suspend fun getBreed(@Path("id") breedId: Int): BreedDTO
}