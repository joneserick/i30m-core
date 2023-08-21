package br.com.jones.library.core.features.breeds

import br.com.jones.library.core.features.breed.network.mappers.BreedMapper
import br.com.jones.library.core.features.breed.network.mappers.BreedWeightMapper
import br.com.jones.library.core.mocks.breeds.BreedMocks
import io.kotlintest.matchers.asClue
import io.kotlintest.shouldBe
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class BreedMapperTest {

    private val mapper: BreedMapper = BreedMapper(BreedWeightMapper())

    @Test
    fun `should retrieve a valid BreedDTO when calling toDomain`() {
        val expected = BreedMocks.breedDTOMock

        val result = mapper.toDomain(expected)

        result.asClue {
            it.id shouldBe expected.id
            it.name shouldBe expected.name
            it.weight?.imperial shouldBe expected.weight?.imperial
            it.weight?.metric shouldBe expected.weight?.metric
            it.cfaUrl shouldBe expected.cfaUrl
            it.vetStreetUrl shouldBe expected.vetStreetUrl
            it.vcaHospitalsUrl shouldBe expected.vcaHospitalsUrl
            it.temperament shouldBe expected.temperament
            it.origin shouldBe expected.origin
            it.countryCodes shouldBe expected.countryCodes
            it.countryCode shouldBe expected.countryCode
            it.description shouldBe expected.description
            it.lifeSpan shouldBe expected.lifeSpan
            it.indoor shouldBe expected.indoor
            it.lap shouldBe expected.lap
            it.altNames shouldBe expected.altNames
            it.dogFriendly shouldBe expected.dogFriendly
            it.energyLevel shouldBe expected.energyLevel
            it.grooming shouldBe expected.grooming
            it.healthIssues shouldBe expected.healthIssues
            it.intelligence shouldBe expected.intelligence
            it.sheddingLevel shouldBe expected.sheddingLevel
            it.socialNeeds shouldBe expected.socialNeeds
            it.strangerFriendly shouldBe expected.strangerFriendly
            it.vocalisation shouldBe expected.vocalisation
            it.experimental shouldBe expected.experimental
            it.hairless shouldBe expected.hairless
            it.natural shouldBe expected.natural
            it.rare shouldBe expected.rare
            it.rex shouldBe expected.rex
            it.suppressedTail shouldBe expected.suppressedTail
            it.shortLegs shouldBe expected.shortLegs
            it.wikipediaUrl shouldBe expected.wikipediaUrl
            it.hypoallergenic shouldBe expected.hypoallergenic
            it.referenceImageId shouldBe expected.referenceImageId
        }

    }

    @Test
    fun `should retrieve a BreedDTO when calling toDomain without weight`() {
        val expected = BreedMocks.breedDTOMock.copy(
            weight = null
        )

        val result = mapper.toDomain(expected)

        result.asClue {
            it.id shouldBe expected.id
            it.name shouldBe expected.name
            it.weight shouldBe null
            it.cfaUrl shouldBe expected.cfaUrl
            it.vetStreetUrl shouldBe expected.vetStreetUrl
            it.vcaHospitalsUrl shouldBe expected.vcaHospitalsUrl
            it.temperament shouldBe expected.temperament
            it.origin shouldBe expected.origin
            it.countryCodes shouldBe expected.countryCodes
            it.countryCode shouldBe expected.countryCode
            it.description shouldBe expected.description
            it.lifeSpan shouldBe expected.lifeSpan
            it.indoor shouldBe expected.indoor
            it.lap shouldBe expected.lap
            it.altNames shouldBe expected.altNames
            it.dogFriendly shouldBe expected.dogFriendly
            it.energyLevel shouldBe expected.energyLevel
            it.grooming shouldBe expected.grooming
            it.healthIssues shouldBe expected.healthIssues
            it.intelligence shouldBe expected.intelligence
            it.sheddingLevel shouldBe expected.sheddingLevel
            it.socialNeeds shouldBe expected.socialNeeds
            it.strangerFriendly shouldBe expected.strangerFriendly
            it.vocalisation shouldBe expected.vocalisation
            it.experimental shouldBe expected.experimental
            it.hairless shouldBe expected.hairless
            it.natural shouldBe expected.natural
            it.rare shouldBe expected.rare
            it.rex shouldBe expected.rex
            it.suppressedTail shouldBe expected.suppressedTail
            it.shortLegs shouldBe expected.shortLegs
            it.wikipediaUrl shouldBe expected.wikipediaUrl
            it.hypoallergenic shouldBe expected.hypoallergenic
            it.referenceImageId shouldBe expected.referenceImageId
        }

    }

}