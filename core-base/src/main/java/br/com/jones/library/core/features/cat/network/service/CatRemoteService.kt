package br.com.jones.library.core.features.cat.network.service

import br.com.jones.library.core.base.BaseServiceFactory
import br.com.jones.library.core.features.cat.models.Cat
import br.com.jones.library.core.features.cat.network.CatApi
import br.com.jones.library.core.features.cat.network.dto.CatDTO

class CatRemoteService : BaseServiceFactory<CatApi>(CatApi::class.java), ICatRemoteDataSource {

    override suspend fun getCatImages(limit: Int, hasBreeds: Int): List<CatDTO> =
        api.getCatImages(limit, hasBreeds)


    override suspend fun getCatImageById(imageId: String): Cat =
        api.getCatImageById(imageId)

    override suspend fun getCatImageById(
        imageId: String,
        subId: String,
        size: Short,
        includeVote: Boolean,
        includeFavorites: Boolean
    ): Cat =
        api.getCatImageById(imageId, subId, size, includeVote, includeFavorites)

}