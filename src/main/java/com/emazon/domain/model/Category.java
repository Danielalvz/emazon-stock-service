package com.emazon.domain.model;

import com.emazon.domain.exception.EmptyFieldException;
import com.emazon.domain.exception.ExceedsMaxLengthException;
import com.emazon.domain.util.DomainConstants;

public class Category {
    private Long id;
    private String name;
    private String description;

    public Category(Long id, String name, String description) {
        if (name.trim().isEmpty()) {
            throw new EmptyFieldException(DomainConstants.FIELD_CATEGORY_NAME_NULL_MESSAGE);
        }
        if (description.trim().isEmpty()) {
            throw new EmptyFieldException(DomainConstants.FIELD_CATEGORY_DESCRIPTION_NULL_MESSAGE);
        }
        if (name.length() > DomainConstants.MAX_CATEGORY_NAME_LENGTH) {
            throw new ExceedsMaxLengthException(DomainConstants.Field.CATEGORY_NAME.toString(), DomainConstants.MAX_CATEGORY_NAME_LENGTH);
        }
        if (description.length() > DomainConstants.MAX_CATEGORY_DESCRIPTION_LENGTH) {
            throw new ExceedsMaxLengthException(DomainConstants.Field.CATEGORY_DESCRIPTION.toString(), DomainConstants.MAX_CATEGORY_DESCRIPTION_LENGTH);
        }
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
