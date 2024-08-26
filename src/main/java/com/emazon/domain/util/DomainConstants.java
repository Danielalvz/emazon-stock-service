package com.emazon.domain.util;

public class DomainConstants {
    public enum Field {
        CATEGORY_NAME,
        CATEGORY_DESCRIPTION
    }

    public static final String FIELD_CATEGORY_NAME_NULL_MESSAGE = "Field 'category-name' cannot be null";
    public static final String FIELD_CATEGORY_DESCRIPTION_NULL_MESSAGE = "Field 'category-description' cannot be null";

    public static final int MAX_CATEGORY_NAME_LENGTH = 50;
    public static final int MAX_CATEGORY_DESCRIPTION_LENGTH = 90;


}
