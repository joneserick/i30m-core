package br.com.jones.library.core.features.images.network.service

import br.com.jones.library.core.base.BaseServiceFactory
import br.com.jones.library.core.features.images.models.Cat
import br.com.jones.library.core.features.images.network.ImagesApi
import br.com.jones.library.core.features.images.network.dto.ImagesDTO

class ImagesService : BaseServiceFactory<ImagesApi>(ImagesApi::class.java), ImagesRemoteDataSource {

    override suspend fun getCatImages(limit: Int, hasBreeds: Int): ArrayList<ImagesDTO> =
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