package br.com.jones.library.core.features.breed.network.mappers

import br.com.jones.library.core.features.breed.models.Breed
import br.com.jones.library.core.features.breed.network.dto.BreedDTO

class BreedMapper(private val weighMapper: BreedWeightMapper) {
    fun toDomain(dto: BreedDTO): Breed =
        Breed(
            id = dto.id,
            name = dto.name,
            temperament = dto.temperament,
            lifeSpan = dto.lifeSpan,
            altNames = dto.altNames,
            wikipediaUrl = dto.wikipediaUrl,
            origin = dto.origin,
            weight = weighMapper.toDomain(dto.weight),
            countryCode = dto.countryCode,
            description = dto.description,
            indoor = dto.indoor,
            lap = dto.lap,
            dogFriendly = dto.dogFriendly,
            energyLevel = dto.energyLevel,
            grooming = dto.grooming,
            healthIssues = dto.healthIssues,
            intelligence = dto.intelligence,
            sheddingLevel = dto.sheddingLevel,
            socialNeeds = dto.socialNeeds,
            strangerFriendly = dto.strangerFriendly,
            vocalisation = dto.vocalisation,
            experimental = dto.experimental,
            hairless = dto.hairless,
            natural = dto.natural,
            rare = dto.rare,
            rex = dto.rex,
            suppressedTail = dto.suppressedTail,
            shortLegs = dto.shortLegs,
            hypoallergenic = dto.hypoallergenic,
            cfaUrl = dto.cfaUrl,
            vetStreetUrl = dto.vetStreetUrl,
            vcaHospitalsUrl = dto.vcaHospitalsUrl,
            countryCodes = dto.countryCodes,
            referenceImageId = dto.referenceImageId
        )
}