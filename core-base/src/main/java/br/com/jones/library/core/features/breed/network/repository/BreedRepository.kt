package br.com.jones.library.core.features.breed.network.repository

import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import br.com.jones.library.core.features.breed.network.service.BreedRemoteDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext

class BreedRepository(private val remoteDataSource: BreedRemoteDataSource) : IBreedRepository {

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