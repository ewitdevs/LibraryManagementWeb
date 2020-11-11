package com.ewit.librarymanagement.librarybl.security;

import com.ewit.librarymanagement.librarybl.utils.Constant;
import org.springframework.security.core.Authentication;

public interface JwtProvider extends Constant.JwtConstant {
    void init();

    String generateToken(Authentication authentication);

    boolean validateToken(String token);

    String getUsernameFromJwt(String token);

    Long getJwtExpirationInMillis();

    String generateTokenWithUserName(String username);
}
