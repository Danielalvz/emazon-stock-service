package com.emazon.domain.spi;

import com.emazon.domain.model.Category;

import java.util.List;

public interface ICategoryPersistencePort {
    void saveCategory(Category category);
    Category getCategory(String name);
    List<Category> getAllCategories(Integer page, Integer size);
}
