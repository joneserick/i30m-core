package br.com.jones.library.core.features.base.di

import br.com.jones.library.core.base.di.I30MCoreDI
import br.com.jones.library.core.features.breed.network.service.IBreedRemoteDataSource
import br.com.jones.library.core.features.images.network.service.ImagesRemoteDataSource
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.koin.test.verify.verify

@RunWith(JUnit4::class)
class I30MCoreDITest : KoinTest {


    private val i30MModule = module {
        includes(I30MCoreDI.baseModule)
    }

    @OptIn(KoinExperimentalAPI::class)
    @Test
    fun `should inject modules correctly`() {
        i30MModule.verify(
            extraTypes = listOf(
                ImagesRemoteDataSource::class,
                IBreedRemoteDataSource::class
            )
        )
    }

}