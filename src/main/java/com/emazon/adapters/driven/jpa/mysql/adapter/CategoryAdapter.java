package com.emazon.adapters.driven.jpa.mysql.adapter;

import com.emazon.adapters.driven.jpa.mysql.entity.CategoryEntity;
import com.emazon.adapters.driven.jpa.mysql.exception.CategoryAlreadyExistsException;
import com.emazon.adapters.driven.jpa.mysql.exception.ElementNotFoundException;
import com.emazon.adapters.driven.jpa.mysql.mapper.ICategoryEntityMapper;
import com.emazon.adapters.driven.jpa.mysql.repository.ICategoryRepository;
import com.emazon.domain.model.Category;
import com.emazon.domain.spi.ICategoryPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CategoryAdapter implements ICategoryPersistencePort {
    private final ICategoryRepository categoryRepository;
    private final ICategoryEntityMapper categoryEntityMapper;

    @Override
    public void saveCategory(Category category) {
        if (categoryRepository.findByName(category.getName()).isPresent()) {
            throw new CategoryAlreadyExistsException();
        }
        categoryRepository.save(categoryEntityMapper.toEntity(category));
    }

    @Override
    public Category getCategory(String name) {
        CategoryEntity category = categoryRepository.findByNameContaining(name).orElseThrow(ElementNotFoundException::new);
        return categoryEntityMapper.toModel(category);
    }

    @Override
    public List<Category> getAllCategories(Integer page, Integer size) {
        return null;
    }
}
