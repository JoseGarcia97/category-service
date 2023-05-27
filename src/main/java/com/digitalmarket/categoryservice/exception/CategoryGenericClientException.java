package com.digitalmarket.categoryservice.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;
import java.util.List;
@Data
public class CategoryGenericClientException extends RuntimeException{
    private HttpStatus httpStatus;
    private String message;
    //IdentitySubError es una clase abstracta
    private List<CategorySubError> subErrors;
    private LocalDateTime timestamp;
}
