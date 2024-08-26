package com.emazon.adapters.driving.http.mapper;

import com.emazon.adapters.driving.http.dto.request.AddCategoryRequest;
import com.emazon.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ICategoryRequestMapper {
    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "name", source = "name")
//    @Mapping(target = "description", source = "description")
    Category addRequestToCategory(AddCategoryRequest addCategoryRequest);

}
