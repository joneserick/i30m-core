package br.com.jones.library.core.features.breeds

import br.com.jones.library.core.features.breed.network.mappers.BreedWeightMapper
import br.com.jones.library.core.mocks.breeds.BreedMocks
import io.kotlintest.matchers.asClue
import io.kotlintest.shouldBe
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class BreedWeightMapperTest {

    private val mapper: BreedWeightMapper = BreedWeightMapper()

    @Test
    fun `should retrieve breed weight model when calling mapper toDomain`() {
        val expected = BreedMocks.breedWeightDTOMock

        val result = mapper.toDomain(expected)

        result?.asClue {
            it.imperial shouldBe expected.imperial
            it.metric shouldBe expected.metric
        }
    }
}