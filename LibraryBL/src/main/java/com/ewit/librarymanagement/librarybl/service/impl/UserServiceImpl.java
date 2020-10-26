package com.ewit.librarybl.service.impl;

import com.ewit.librarybl.service.UserService;
import com.ewit.librarydto.model.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

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
