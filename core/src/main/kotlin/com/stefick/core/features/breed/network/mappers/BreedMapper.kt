package com.stefick.core.features.breed.network.mappers

import com.stefick.core.features.breed.models.Breed
import com.stefick.core.features.breed.network.dto.BreedDTO

class BreedMapper {
    fun toDomain(dto: BreedDTO): Breed =
        Breed(
            id = dto.id,
            name = dto.name
        )
}