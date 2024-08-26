package com.emazon.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
//@Getter
@Data
public class CategoryResponse {
    private final Long id;
    private final String name;
    private final String description;

}
