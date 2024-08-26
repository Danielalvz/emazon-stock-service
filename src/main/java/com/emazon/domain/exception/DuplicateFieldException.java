package com.emazon.domain.exception;

public class DuplicateFieldException extends RuntimeException {
    public DuplicateFieldException(String field) {
        super("Field '" + field + "' must be unique");
    }
}
