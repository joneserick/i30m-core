package br.com.jones.library.core.features.breeds

import br.com.jones.library.core.features.breed.network.mappers.BreedMapper
import br.com.jones.library.core.mocks.breeds.BreedMocks
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class BreedMapperTest {

    private val mapper: BreedMapper = BreedMapper()

    @Test
    fun `should retrieve a valid BreedDTO when calling toDomain`() {
        val expected = BreedMocks.breedDTOMock

        val result = mapper.toDomain(expected)

        Assert.assertEquals(expected.id, result.id)
        Assert.assertEquals(expected.name, result.name)
    }

}