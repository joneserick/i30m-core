package br.com.jones.library.core.features.breeds

import br.com.jones.library.core.base.MainDispatcherRule
import br.com.jones.library.core.features.base.di.BaseTest
import br.com.jones.library.core.features.breed.models.Breed
import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import br.com.jones.library.core.features.breed.network.repository.BreedRepository
import br.com.jones.library.core.features.breed.network.repository.IBreedRepository
import br.com.jones.library.core.mocks.breeds.BreedMocks
import io.kotlintest.shouldNot
import io.kotlintest.shouldNotBe
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.koin.dsl.koinApplication

@RunWith(JUnit4::class)
class BreedRepositoryTest : BaseTest() {

    @OptIn(ExperimentalCoroutinesApi::class)
    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()


    private lateinit var repository: IBreedRepository

    @Before
    fun setup() {
        super.setUp()
        repository = BreedRepository(breedService)
    }


    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `should retrieve a valid breed list when requesting`() = runTest {
        val limit = 1
        val page = 0

        val mockedFlow = listOf(BreedMocks.breedDTOMock)

        coEvery { breedService.getBreeds(limit, page) } returns mockedFlow

        repository.getBreeds(limit, page).collect { result ->
            result shouldNotBe null
            Assert.assertTrue(result.isNotEmpty())
        }

    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `should retrieve an empty breed list when requesting and there is no results`() = runTest {
        val limit = 1
        val page = 0

        val mockedFlow = listOf<BreedDTO>()

        coEvery { breedService.getBreeds(limit, page) } returns mockedFlow

        repository.getBreeds(limit, page).collect { result ->
            result shouldNotBe null
            Assert.assertTrue(result.isEmpty())
        }

    }

}