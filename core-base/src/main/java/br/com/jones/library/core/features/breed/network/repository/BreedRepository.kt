package br.com.jones.library.core.features.breed.network.repository

import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import br.com.jones.library.core.features.breed.network.service.IBreedRemoteDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext

class BreedRepository(
    private val remoteDataSource: IBreedRemoteDataSource,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : IBreedRepository {

    override suspend fun getBreeds(limit: Int, page: Int): Flow<List<BreedDTO>> {
        return withContext(dispatcher) {
            flow {
                emit(remoteDataSource.getBreeds(limit, page))
            }
        }
    }

    override suspend fun getBreed(breedId: Int): Flow<BreedDTO> {
        return withContext(dispatcher) {
            flow {
                emit(remoteDataSource.getBreed(breedId))
            }
        }
    }

}