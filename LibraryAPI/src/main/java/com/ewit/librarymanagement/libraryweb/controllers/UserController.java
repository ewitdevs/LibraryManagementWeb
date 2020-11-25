package com.ewit.librarymanagement.libraryweb.controllers;

import com.ewit.librarymanagement.librarybl.service.UserService;
import com.ewit.librarymanagement.librarydto.model.ResponseDTO;
import com.ewit.librarymanagement.librarydto.model.SuccessResponseDTO;
import com.ewit.librarymanagement.librarydto.model.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor()
public class UserController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<SuccessResponseDTO<UserDTO>> save(@RequestBody @Valid UserDTO userDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                SuccessResponseDTO.<UserDTO>builder()
                        .message("Created Successful")
                        .data(service.save(userDTO))
                        .successful(true)
                        .statusCode(HttpStatus.CREATED.value())
                        .build()
        );
    }


}
