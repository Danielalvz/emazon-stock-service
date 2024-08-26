package com.emazon.domain.exception;

public class ExceedsMaxLengthException extends RuntimeException {
    public ExceedsMaxLengthException(String field, int maxLength) {
        super("Field '" + field + "' exceeds the maximum length of " + maxLength + " characters");
    }
}
