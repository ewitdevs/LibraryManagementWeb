package com.ewit.librarymanagement.librarybl.service.impl;

import com.ewit.librarymanagement.librarybl.service.UserService;
import com.ewit.librarymanagement.libraryconverter.core.UserMapper;
import com.ewit.librarymanagement.librarydto.model.UserDTO;
import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.libraryrepository.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDTO save(UserDTO userDTO) {
        User user = mapper.map(userDTO);
        return mapper.mapToDTO(repository.save(user));
    }
}
