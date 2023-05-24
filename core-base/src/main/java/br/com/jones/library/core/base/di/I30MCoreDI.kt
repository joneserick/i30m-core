package br.com.jones.library.core.base.di

import br.com.jones.library.core.features.breed.network.repository.BreedRepository
import br.com.jones.library.core.features.breed.network.service.BreedDataSource
import br.com.jones.library.core.features.breed.network.service.BreedRemoteDataSource
import br.com.jones.library.core.features.images.network.repository.IImageRepository
import br.com.jones.library.core.features.images.network.repository.ImageRepository
import br.com.jones.library.core.features.images.network.service.ImagesRemoteDataSource
import br.com.jones.library.core.features.images.network.service.ImagesService
import org.koin.dsl.module

object I30MCoreDI {

    var module = module {

        factory<BreedRemoteDataSource> {
            BreedDataSource()
        }

        factory<br.com.jones.library.core.features.breed.network.repository.IBreedRepository> {
            BreedRepository(get())
        }

        factory<ImagesRemoteDataSource> {
            ImagesService()
        }

        factory<IImageRepository> {
            ImageRepository(get())
        }

    }
}