package com.stefick.core.features.breed.network.repository

import com.stefick.core.features.breed.network.dto.BreedDTO
import com.stefick.core.features.breed.network.service.BreedRemoteService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext

class BreedRepository(private val remoteDataSource: BreedRemoteService) : IBreedRepository {

    override suspend fun getBreeds(limit: Int, page: Int): Flow<ArrayList<BreedDTO>> {
        return withContext(Dispatchers.IO) {
            flow {
                emit(remoteDataSource.getBreeds(limit, page))
            }
        }
    }

    override suspend fun getBreed(breedId: Int): Flow<BreedDTO> {
        return withContext(Dispatchers.IO) {
            flow {
                emit(remoteDataSource.getBreed(breedId))
            }
        }
    }

}