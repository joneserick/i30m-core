package com.stefick.core.features.images.network.repository

import com.stefick.core.features.images.models.Cat
import com.stefick.core.features.images.network.service.IImagesRemoteService
import com.stefick.core.features.images.network.dto.ImagesDTO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ImageRepository(private val remoteDataSource: IImagesRemoteService) : IImageRepository {

    override suspend fun getCatImages(limit: Int, hasBreeds: Int): Flow<ArrayList<ImagesDTO>> {
        return flow {
            emit(remoteDataSource.getCatImages(limit, hasBreeds))
        }
    }

    override suspend fun getCatImageById(imageId: String): Flow<Cat> {
        return flow {
            emit(remoteDataSource.getCatImageById(imageId))
        }
    }

    override suspend fun getCatImageById(
        imageId: String,
        subId: String,
        size: Short,
        includeVote: Boolean,
        includeFavorites: Boolean
    ): Flow<Cat> {
        return flow {
            emit(
                remoteDataSource.getCatImageById(
                    imageId,
                    subId,
                    size,
                    includeVote,
                    includeFavorites
                )
            )
        }
    }

}