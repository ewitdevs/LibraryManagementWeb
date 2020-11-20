package com.ewit.librarymanagement.librarybl.service;

import com.ewit.librarymanagement.librarymodel.models.RefreshToken;

public interface RefreshTokenService {

    RefreshToken generateRefreshToken();
    void deleteRefreshToken(String token);
    void validateRefreshToken(String token);

}
