package com.ewit.librarymanagement.librarybl.service;

import com.ewit.librarymanagement.librarydto.model.AuthenticationResponse;
import com.ewit.librarymanagement.librarydto.model.LoginRequest;
import com.ewit.librarymanagement.librarydto.model.RefreshTokenRequest;
import com.ewit.librarymanagement.librarymodel.models.User;

public interface AuthService {

    AuthenticationResponse login(LoginRequest loginRequest);

    User getCurrentUser();

    AuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
