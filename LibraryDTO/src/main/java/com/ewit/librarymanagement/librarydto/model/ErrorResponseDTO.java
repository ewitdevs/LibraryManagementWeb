package com.ewit.librarymanagement.librarydto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponseDTO<E> {

    private String message;
    private boolean successful;
    private E error;
    private int statusCode;
}
