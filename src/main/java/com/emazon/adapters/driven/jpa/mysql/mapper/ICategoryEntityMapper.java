package com.emazon.adapters.driven.jpa.mysql.mapper;

import com.emazon.adapters.driven.jpa.mysql.entity.CategoryEntity;
import com.emazon.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ICategoryEntityMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    Category toModel(CategoryEntity categoryEntity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    CategoryEntity toEntity(Category category);
}
