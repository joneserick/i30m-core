package com.stefick.core.features.category.network.mappers

import com.stefick.core.features.category.models.Category
import com.stefick.core.features.category.network.dto.CategoryDTO

class CategoryMapper {
    fun toDomain(dto: CategoryDTO): Category =
        Category(
            id = dto.id,
            name = dto.name
        )
}