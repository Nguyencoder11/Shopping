package com.app.shopease.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundEx extends RuntimeException {
    public ResourceNotFoundEx(String message) {
        super(message);
    }

    public ResourceNotFoundEx(String message, Throwable cause) {
        super(message, cause);
    }
}
