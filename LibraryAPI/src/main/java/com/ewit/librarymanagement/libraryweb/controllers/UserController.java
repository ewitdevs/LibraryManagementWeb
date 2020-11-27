package com.ewit.librarymanagement.libraryweb.controllers;

import com.ewit.librarymanagement.librarybl.service.UserService;
import com.ewit.librarymanagement.librarydto.model.SuccessResponseDTO;
import com.ewit.librarymanagement.librarydto.model.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor()
public class UserController {

    private final UserService service;

    @GetMapping
    public ResponseEntity<SuccessResponseDTO<List<UserDTO>>> getUsers(){
        return  ResponseEntity.ok(
                SuccessResponseDTO.<List<UserDTO >>builder()
                        .message("Created Successful")
                        .data(service.getAll())
                        .successful(true)
                        .statusCode(HttpStatus.OK.value())
                        .build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SuccessResponseDTO<UserDTO>> getUser(@PathVariable("id") Long id){
        return  ResponseEntity.ok(
                SuccessResponseDTO.<UserDTO>builder()
                        .message("Created Successful")
                        .data(service.findUser(id))
                        .successful(true)
                        .statusCode(HttpStatus.OK.value())
                        .build());
    }

    @PostMapping
    public ResponseEntity<SuccessResponseDTO<UserDTO>> save(@RequestBody @Valid UserDTO userDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                SuccessResponseDTO.<UserDTO>builder()
                        .message("Created Successful")
                        .data(service.save(userDTO))
                        .successful(true)
                        .statusCode(HttpStatus.CREATED.value())
                        .build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SuccessResponseDTO<UserDTO>> update(@PathVariable("id") Long id ,@RequestBody @Valid UserDTO userDTO){
        userDTO.setId(id);
        return ResponseEntity.ok(
                SuccessResponseDTO.<UserDTO>builder()
                        .message("Updated Successful")
                        .data(service.update(id,userDTO))
                        .successful(true)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }


}
