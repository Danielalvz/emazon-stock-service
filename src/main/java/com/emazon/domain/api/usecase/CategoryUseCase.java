package com.emazon.domain.api.usecase;

import com.emazon.domain.api.ICategoryServicePort;
import com.emazon.domain.exception.DuplicateFieldException;
import com.emazon.domain.model.Category;
import com.emazon.domain.spi.ICategoryPersistencePort;
import com.emazon.domain.util.DomainConstants;

import java.util.List;

public class CategoryUseCase implements ICategoryServicePort {
    private ICategoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }

    @Override
    public void saveCategory(Category category) {
        Category existingCategory = categoryPersistencePort.getCategory(category.getName());
        //If category exists
        if (existingCategory != null) {
            throw new DuplicateFieldException(DomainConstants.Field.CATEGORY_NAME.toString());
        }
        categoryPersistencePort.saveCategory(category);
    }

    @Override
    public Category getCategory(String name) {
        return categoryPersistencePort.getCategory(name);
    }

    @Override
    public List<Category> getAllCategories(Integer page, Integer size) {
        return categoryPersistencePort.getAllCategories(page, size);
    }
}
