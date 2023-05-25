package br.com.jones.library.core.features.breed.network.service

import br.com.jones.library.core.base.BaseServiceFactory
import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import br.com.jones.library.core.features.breed.network.BreedApi

class BreedService : BaseServiceFactory<BreedApi>(BreedApi::class.java), BreedRemoteDataSource {

    override suspend fun getBreeds(
        limit: Int,
        page: Int
    ): ArrayList<BreedDTO> =
        api.getBreeds(limit, page)

    override suspend fun getBreed(breedId: Int): BreedDTO =
        api.getBreed(breedId)
}