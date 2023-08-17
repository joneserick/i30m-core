package br.com.jones.library.core.features.breed.network.repository

import br.com.jones.library.core.features.breed.models.Breed
import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import br.com.jones.library.core.features.breed.network.mappers.BreedMapper
import br.com.jones.library.core.features.breed.network.service.IBreedRemoteDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext

class BreedRepository(
    private val remoteDataSource: IBreedRemoteDataSource,
    private val mapper: BreedMapper,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : IBreedRepository {

    override suspend fun getBreeds(limit: Int, page: Int): Flow<List<Breed>> {
        return withContext(dispatcher) {
            flow {
                val response: List<Breed> = remoteDataSource.getBreeds(limit, page)
                    .map {
                        mapper.toDomain(it)
                    }
                    .toList()
                emit(response)
            }
        }
    }

    override suspend fun getBreed(breedId: Int): Flow<Breed> {
        return withContext(dispatcher) {
            flow {
                val response = remoteDataSource.getBreed(breedId)
                emit(mapper.toDomain(response))
            }
        }
    }

}