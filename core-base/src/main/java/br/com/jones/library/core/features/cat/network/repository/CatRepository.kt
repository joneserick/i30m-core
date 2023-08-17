package br.com.jones.library.core.features.cat.network.repository

import br.com.jones.library.core.features.cat.models.Cat
import br.com.jones.library.core.features.cat.network.dto.CatDTO
import br.com.jones.library.core.features.cat.network.service.ICatRemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CatRepository(private val remoteDataSource: ICatRemoteDataSource) : ICatRepository {

    override suspend fun getCatImages(limit: Int, hasBreeds: Int): Flow<List<CatDTO>> {
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