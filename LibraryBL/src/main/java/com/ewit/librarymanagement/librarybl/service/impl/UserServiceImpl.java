package com.ewit.librarymanagement.librarybl.service.impl;

import com.ewit.librarymanagement.librarybl.service.InitUserService;
import com.ewit.librarymanagement.librarybl.service.UserService;
import com.ewit.librarymanagement.librarydto.model.UserDTO;
import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.librarymodel.models.UserType;
import com.ewit.librarymanagement.libraryrepository.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{


    @Value("${secure.username}")
    private String username;

    @Value("${secure.default-password}")
    private String defaultPassword;

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }


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
