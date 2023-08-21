package br.com.jones.library.core.features.breed.network.mappers

import br.com.jones.library.core.features.breed.models.BreedWeight
import br.com.jones.library.core.features.breed.network.dto.BreedWeightDTO

class BreedWeightMapper {
    fun toDomain(dto: BreedWeightDTO?): BreedWeight? {
        return dto?.let {
            BreedWeight(
                imperial = it.imperial,
                metric = it.metric
            )
        }
    }
}