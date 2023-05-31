package br.com.jones.library.core.features.base.di

import br.com.jones.library.core.features.breed.network.repository.BreedRepository
import br.com.jones.library.core.features.breed.network.repository.IBreedRepository
import br.com.jones.library.core.features.breed.network.service.BreedService
import br.com.jones.library.core.features.breed.network.service.IBreedRemoteDataSource
import io.mockk.mockk
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.context.unloadKoinModules
import org.koin.dsl.module
import org.koin.test.KoinTest

abstract class BaseTest : KoinTest {

    val breedService: BreedService = mockk(relaxed = true)

    val breedRepository: BreedRepository = mockk(relaxed = true)

    private val module = module {

        factory<IBreedRepository> { breedRepository }

        factory { breedService }
    }

    open fun setUp() {
        startKoin {
            modules(module)
        }
        loadKoinModules(module)
    }

    open fun tearDown() {
        unloadKoinModules(module)
        stopKoin()
    }

}