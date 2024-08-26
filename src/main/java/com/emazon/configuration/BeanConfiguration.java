package com.emazon.configuration;

import com.emazon.adapters.driven.jpa.mysql.adapter.CategoryAdapter;
import com.emazon.adapters.driven.jpa.mysql.mapper.ICategoryEntityMapper;
import com.emazon.adapters.driven.jpa.mysql.repository.ICategoryRepository;
import com.emazon.domain.api.ICategoryServicePort;
import com.emazon.domain.api.usecase.CategoryUseCase;
import com.emazon.domain.spi.ICategoryPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final ICategoryRepository categoryRepository;
    private final ICategoryEntityMapper categoryEntityMapper;
    @Bean
    public ICategoryPersistencePort categoryPersistencePort() {
        return new CategoryAdapter(categoryRepository, categoryEntityMapper);
    }
    @Bean
    public ICategoryServicePort categoryServicePort() {
        return  new CategoryUseCase(categoryPersistencePort());
    }
}