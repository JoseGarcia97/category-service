package com.digitalmarket.categoryservice.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;
@Data
@Builder
public class CategoryError {
    private HttpStatus httpStatus;
    private LocalDateTime timestamp;
    private String message;
    private String debugMessage;
    private List<CategorySubError> subErrors;
}
