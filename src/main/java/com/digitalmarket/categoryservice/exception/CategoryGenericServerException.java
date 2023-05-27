package com.digitalmarket.categoryservice.exception;

import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

public class CategoryGenericServerException extends RuntimeException{
    private HttpStatus httpStatus;
    private String message;
    private LocalDateTime timestamp;
}
