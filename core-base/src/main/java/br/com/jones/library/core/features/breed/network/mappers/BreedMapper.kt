package br.com.jones.library.core.features.breed.network.mappers

import br.com.jones.library.core.features.breed.models.Breed
import br.com.jones.library.core.features.breed.network.dto.BreedDTO

class BreedMapper {
    fun toDomain(dto: br.com.jones.library.core.features.breed.network.dto.BreedDTO): br.com.jones.library.core.features.breed.models.Breed =
        br.com.jones.library.core.features.breed.models.Breed(
            id = dto.id,
            name = dto.name
        )
}