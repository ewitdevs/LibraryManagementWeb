package com.ewit.librarymanagement.libraryweb.advices;

import com.ewit.librarymanagement.librarydto.model.ResponseDTO;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ApiExceptionHandlerAdvice {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseEntity<ResponseDTO<String>> handleConstraintViolationException(MethodArgumentNotValidException constraintViolationException){
        return ResponseEntity.badRequest().body(
                ResponseDTO.<String>builder()
                        .successful(false)
                        .data(constraintViolationException.getMessage())
                        .message("Failed")
                        .build()
        );
    }
}

