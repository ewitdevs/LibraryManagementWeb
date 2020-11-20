package com.ewit.librarymanagement.librarybl.service.impl;

import com.ewit.librarymanagement.librarybl.exceptions.LibraryException;
import com.ewit.librarymanagement.librarybl.service.RefreshTokenService;
import com.ewit.librarymanagement.librarymodel.models.RefreshToken;
import com.ewit.librarymanagement.libraryrepository.repositories.RefreshTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class RefreshTokenServiceImpl implements RefreshTokenService {
    private final RefreshTokenRepository repository;

    @Override
    public RefreshToken generateRefreshToken() {
        RefreshToken refreshToken = RefreshToken.builder()
                .token(UUID.randomUUID().toString())
                .createDate(Instant.now()).build();
        return repository.save(refreshToken);
    }

    @Override
    public void deleteRefreshToken(String token) {
        RefreshToken refreshToken = repository.findByToken(token).orElseThrow(()-> new LibraryException("Invalid Refresh token"));
        repository.delete(refreshToken);
    }

    @Override
    public void validateRefreshToken(String token) {
        repository.findByToken(token)
                .orElseThrow(()-> new LibraryException("Invalid Refresh token"));
    }
}
