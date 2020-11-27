package com.ewit.librarymanagement.librarybl.service.impl;

import com.ewit.librarymanagement.librarybl.exceptions.NotFoundException;
import com.ewit.librarymanagement.librarybl.service.UserService;
import com.ewit.librarymanagement.libraryconverter.core.UserMapper;
import com.ewit.librarymanagement.librarydto.model.UserDTO;
import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.librarymodel.models.UserType;
import com.ewit.librarymanagement.libraryrepository.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    @Transactional
    public UserDTO update(Long id, UserDTO userDTO) {
        repository.findById(id).orElseThrow(()-> new NotFoundException("User with id "+id+" not found"));
        User user = mapper.map(userDTO);
        return mapper.mapToDTO(repository.save(user));
    }

    @Override
    public List<UserDTO> getAll() {
        return repository.findAllByTypeNot(UserType.ADMIN).stream().map(mapper::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public UserDTO findUser(Long id) {
        User user = repository.findById(id).orElseThrow(()-> new NotFoundException("User with id "+id+" not found"));
        return mapper.mapToDTO(user);
    }
}
