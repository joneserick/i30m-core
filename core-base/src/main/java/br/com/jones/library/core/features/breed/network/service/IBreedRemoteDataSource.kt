package br.com.jones.library.core.features.breed.network.service

import br.com.jones.library.core.features.breed.network.dto.BreedDTO

interface IBreedRemoteDataSource {
    suspend fun getBreeds(limit: Int, page: Int): List<BreedDTO>
    suspend fun getBreed(breedId: Int): BreedDTO
}
