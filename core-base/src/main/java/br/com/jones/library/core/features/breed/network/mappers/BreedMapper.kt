package br.com.jones.library.core.features.breed.network.mappers

import br.com.jones.library.core.features.breed.models.Breed
import br.com.jones.library.core.features.breed.network.dto.BreedDTO

class BreedMapper {
    fun toDomain(dto: BreedDTO): Breed =
        Breed(
            id = dto.id,
            name = dto.name
        )
}