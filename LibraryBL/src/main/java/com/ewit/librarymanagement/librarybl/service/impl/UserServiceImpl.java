package com.ewit.librarymanagement.librarybl.service.impl;

import com.ewit.librarymanagement.librarybl.service.UserService;
import com.ewit.librarymanagement.librarydto.model.UserDTO;
import com.ewit.librarymanagement.libraryrepository.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository repository;


    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public Optional<UserDTO> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDTO> save(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDTO> update(UserDTO userDTO, Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(UserDTO userDTO) {
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
