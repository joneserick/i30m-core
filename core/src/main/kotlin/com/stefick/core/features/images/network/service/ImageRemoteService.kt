package com.stefick.core.features.images.network.service

import com.stefick.core.base.ServiceFactory
import com.stefick.core.features.images.models.Cat
import com.stefick.core.features.images.network.ImagesApi
import com.stefick.core.features.images.network.dto.ImagesDTO

class ImageRemoteService : IImagesRemoteService, ServiceFactory<ImagesApi>(ImagesApi::class.java) {

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