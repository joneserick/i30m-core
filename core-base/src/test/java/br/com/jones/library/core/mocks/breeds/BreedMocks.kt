package br.com.jones.library.core.mocks.breeds

import br.com.jones.library.core.features.breed.network.dto.BreedDTO
import br.com.jones.library.core.features.breed.network.dto.BreedWeightDTO

object BreedMocks {

    val breedWeightDTOMock = BreedWeightDTO(
        imperial = "imperial",
        metric = "metric"
    )

    val breedDTOMock: BreedDTO = BreedDTO(
        id = "id",
        name = "breed",
        weight = breedWeightDTOMock,
        cfaUrl = "cfaUrl",
        vetStreetUrl = "vetStreetUrl",
        vcaHospitalsUrl = "vcaHospitalsUrl",
        temperament = "temperament",
        origin = "origin",
        countryCodes = "country-codes",
        countryCode = "country-code",
        description = "description",
        lifeSpan = "life-span",
        indoor = 1,
        lap = 1,
        altNames = "alt-names",
        dogFriendly = 1,
        energyLevel = 1,
        grooming = 1,
        healthIssues = 1,
        intelligence = 1,
        sheddingLevel = 1,
        socialNeeds = 1,
        strangerFriendly = 1,
        vocalisation = 1,
        experimental = 1,
        hairless = 1,
        natural = 1,
        rare = 1,
        rex = 1,
        suppressedTail = 1,
        shortLegs = 1,
        wikipediaUrl = "wikipedia-url",
        hypoallergenic = 1,
        referenceImageId = "reference-image-id"
    )

}