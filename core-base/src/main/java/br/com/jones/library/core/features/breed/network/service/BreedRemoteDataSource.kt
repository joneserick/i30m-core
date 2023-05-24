package br.com.jones.library.core.features.breed.network.service

import br.com.jones.library.core.features.breed.network.dto.BreedDTO

interface BreedRemoteDataSource {
    suspend fun getBreeds(limit: Int, page: Int): ArrayList<br.com.jones.library.core.features.breed.network.dto.BreedDTO>
    suspend fun getBreed(breedId: Int): br.com.jones.library.core.features.breed.network.dto.BreedDTO
}
