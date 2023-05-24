package br.com.jones.library.core.features.category.network.mappers

import br.com.jones.library.core.features.category.models.Category
import br.com.jones.library.core.features.category.network.dto.CategoryDTO


class CategoryMapper {
    fun toDomain(dto: CategoryDTO): Category =
        Category(
            id = dto.id,
            name = dto.name
        )
}