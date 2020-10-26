package com.ewit.librarymanagement.librarybl.service.impl;

import com.ewit.librarymanagement.librarybl.service.InitUserService;
import com.ewit.librarymanagement.librarybl.service.UserService;
import com.ewit.librarymanagement.librarydto.model.UserDTO;
import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.librarymodel.models.UserType;
import com.ewit.librarymanagement.libraryrepository.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, InitUserService {
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
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

    @Override
    public void initializeUser() {
      List<User> users = repository.findAllByType(UserType.ADMIN);
        System.out.println("Admin User "+users);
    }
}
