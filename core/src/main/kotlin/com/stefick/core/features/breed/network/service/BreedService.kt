package com.stefick.core.features.breed.network.service

import com.stefick.core.features.breed.network.dto.BreedDTO
import com.stefick.core.base.ServiceFactory
import com.stefick.core.features.breed.network.BreedApi

class BreedService() : ServiceFactory<BreedApi>(BreedApi::class.java), BreedRemoteService {

    override suspend fun getBreeds(limit: Int, page: Int): ArrayList<BreedDTO> =
        api.getBreeds(limit, page)

    override suspend fun getBreed(breedId: Int): BreedDTO =
        api.getBreed(breedId)
}