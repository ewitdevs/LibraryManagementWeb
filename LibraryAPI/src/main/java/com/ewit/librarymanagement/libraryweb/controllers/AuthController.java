package com.ewit.librarymanagement.libraryweb.controllers;

import com.ewit.librarymanagement.librarybl.service.AuthService;
import com.ewit.librarymanagement.librarybl.service.RefreshTokenService;
import com.ewit.librarymanagement.librarydto.model.AuthenticationResponse;
import com.ewit.librarymanagement.librarydto.model.LoginRequest;
import com.ewit.librarymanagement.librarydto.model.RefreshTokenRequest;
import com.ewit.librarymanagement.librarydto.model.SuccessResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
@Validated
public class AuthController {

    private final AuthService service;
    private final RefreshTokenService refreshTokenService;

    @PostMapping("/login")
    public ResponseEntity<SuccessResponseDTO<AuthenticationResponse>> login(@Valid @RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(SuccessResponseDTO.<AuthenticationResponse>builder()
                .message("Success")
                .successful(true)
                .data(service.login(loginRequest))
                .statusCode(HttpStatus.OK.value())
                .build());
    }

    @PostMapping("/refresh")
    public ResponseEntity<SuccessResponseDTO<AuthenticationResponse>> refreshToken(@Valid @RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(SuccessResponseDTO.<AuthenticationResponse>builder()
                .message("Success")
                .successful(true)
                .data(service.refreshToken(refreshTokenRequest))
                .statusCode(HttpStatus.OK.value())
                .build());
    }

    @PostMapping("/logout")
    public ResponseEntity<SuccessResponseDTO<String>> logout(@Valid @RequestBody RefreshTokenRequest refreshTokenRequest){
        refreshTokenService.deleteRefreshToken(refreshTokenRequest.getRefreshToken());
        return ResponseEntity.ok(SuccessResponseDTO.<String>builder()
                .message("Success")
                .successful(true)
                .data("Refresh Token Delete Successfully")
                .statusCode(HttpStatus.OK.value())
                .build());
    }

}
