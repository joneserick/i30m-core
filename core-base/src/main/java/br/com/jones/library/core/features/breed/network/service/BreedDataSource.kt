package br.com.jones.library.core.features.breed.network.service

import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import br.com.jones.library.core.base.ServiceFactory
import br.com.jones.library.core.features.breed.network.BreedApi

class BreedDataSource() : br.com.jones.library.core.base.ServiceFactory<br.com.jones.library.core.features.breed.network.BreedApi>(
    br.com.jones.library.core.features.breed.network.BreedApi::class.java),
    br.com.jones.library.core.features.breed.network.service.BreedRemoteDataSource {

    override suspend fun getBreeds(limit: Int, page: Int): ArrayList<br.com.jones.library.core.features.breed.network.dto.BreedDTO> =
        api.getBreeds(limit, page)

    override suspend fun getBreed(breedId: Int): br.com.jones.library.core.features.breed.network.dto.BreedDTO =
        api.getBreed(breedId)
}