package com.emazon.domain.api;

import com.emazon.domain.model.Category;

import java.util.List;

public interface ICategoryServicePort {
    void saveCategory(Category category);
    Category getCategory(String name);
    List<Category> getAllCategories(Integer page, Integer size);
}
