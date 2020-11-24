package com.ewit.librarymanagement.librarydto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuccessResponseDTO<T> {
    private String message;
    private boolean successful;
    private T data;
    private int statusCode;
}
