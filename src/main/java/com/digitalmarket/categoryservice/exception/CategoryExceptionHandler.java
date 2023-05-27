package com.digitalmarket.categoryservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CategoryExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(CategoryGenericClientException.class)
    protected ResponseEntity<Object> handleGenericClientException(CategoryGenericClientException e) {
        CategoryError error = CategoryError
                .builder()
                .httpStatus(e.getHttpStatus())
                .message(e.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity(error, error.getHttpStatus());
    }

    @ExceptionHandler(CategoryGenericServerException.class)
    protected ResponseEntity<Object> handleGenericServerException(CategoryGenericServerException e) {
        return null;
    }
}
