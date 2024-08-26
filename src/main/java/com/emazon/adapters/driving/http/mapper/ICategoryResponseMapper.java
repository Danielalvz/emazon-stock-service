package com.emazon.adapters.driving.http.mapper;

import com.emazon.adapters.driving.http.dto.response.CategoryResponse;
import com.emazon.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICategoryResponseMapper {
//    @Mapping(target = "id", source = "id")
//    @Mapping(target = "name", source = "name")
//    @Mapping(target = "description", source = "description")
    @Mapping(target = "id", ignore = true)
    CategoryResponse toCategoryResponse(Category category);
    List<CategoryResponse> toCategoryResponseList(List<Category> categories);
}
