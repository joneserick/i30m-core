package com.stefick.core.features.breed.network.service

import com.stefick.core.features.breed.network.dto.BreedDTO

interface BreedRemoteService {
    suspend fun getBreeds(limit: Int, page: Int): ArrayList<BreedDTO>
    suspend fun getBreed(breedId: Int): BreedDTO
}
