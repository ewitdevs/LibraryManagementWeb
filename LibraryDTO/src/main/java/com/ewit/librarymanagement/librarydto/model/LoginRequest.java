package com.ewit.librarymanagement.librarydto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

    @NonNull
    private String username;
    @NonNull
    private String password;
}
