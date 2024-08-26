package com.emazon.adapters.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
//@Getter
@Data
public class AddCategoryRequest {


    private final String name;
    private final String description;
}
