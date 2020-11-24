package com.ewit.librarymanagement.libraryweb.advices;

import com.ewit.librarymanagement.librarydto.model.ErrorDataDTO;
import com.ewit.librarymanagement.librarydto.model.ErrorResponseDTO;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
@ResponseBody
public class ApiExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseEntity<ErrorResponseDTO<ErrorDataDTO>> handleConstraintViolationException(Exception exception){
        return ResponseEntity.badRequest().body(
                ErrorResponseDTO.<ErrorDataDTO>builder()
                        .successful(false)
                        .error(ErrorDataDTO.builder()
                        .message("Unknown Error")
                        .details(List.of(exception.getMessage()))
                                .build()
                        )
                        .message("Failed")
                        .statusCode(HttpStatus.BAD_REQUEST.value())
                        .build()
        );
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponseDTO.<ErrorDataDTO>builder()
                        .successful(false)
                        .error(ErrorDataDTO.builder()
                                .message("ValidationError")
                                .details(ex.getBindingResult().getAllErrors().stream()
                                        .map(DefaultMessageSourceResolvable::getDefaultMessage)
                                        .collect(Collectors.toList())).build())
                        .message("Failed")
                        .statusCode(HttpStatus.BAD_REQUEST.value())
                        .build());
    }

    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(ErrorResponseDTO.<ErrorDataDTO>builder()
                .successful(false)
                .error(ErrorDataDTO.builder()
                        .message("Required Input is missing")
                        .details(List.of("Input is improper"))
                        .build())

                .message("Failed")
                .statusCode(HttpStatus.METHOD_NOT_ALLOWED.value())
                .build());
    }
}

