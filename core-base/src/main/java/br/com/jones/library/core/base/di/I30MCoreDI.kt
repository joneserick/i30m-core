package br.com.jones.library.core.base.di

import br.com.jones.library.core.features.breed.network.mappers.BreedMapper
import br.com.jones.library.core.features.breed.network.mappers.BreedWeightMapper
import br.com.jones.library.core.features.breed.network.repository.BreedRepository
import br.com.jones.library.core.features.breed.network.repository.IBreedRepository
import br.com.jones.library.core.features.breed.network.service.BreedService
import br.com.jones.library.core.features.breed.network.service.IBreedRemoteDataSource
import br.com.jones.library.core.features.cat.network.repository.ICatRepository
import br.com.jones.library.core.features.cat.network.repository.CatRepository
import br.com.jones.library.core.features.cat.network.service.ICatRemoteDataSource
import br.com.jones.library.core.features.cat.network.service.CatRemoteService
import org.koin.dsl.module

object I30MCoreDI {

    var baseModule = module {

        factory<IBreedRemoteDataSource> {
            BreedService()
        }

        factory<IBreedRepository> {
            BreedRepository(
                remoteDataSource = get(),
                mapper = get()
            )
        }

        factory<ICatRemoteDataSource> {
            CatRemoteService()
        }

        factory<ICatRepository> {
            CatRepository(get())
        }


        factory {
            BreedWeightMapper()
        }

        factory {
            BreedMapper(get())
        }

    }
}