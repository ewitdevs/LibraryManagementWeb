package com.ewit.librarymanagement.librarydto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class ResponseDTO {
    private String message;
    private boolean successful;
    private int statusCode;
}
