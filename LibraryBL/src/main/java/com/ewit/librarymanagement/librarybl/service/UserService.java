package com.ewit.librarymanagement.librarybl.service;

import com.ewit.librarymanagement.librarydto.model.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO save(UserDTO userDTO);

    UserDTO update(Long id,UserDTO userDTO);

    List<UserDTO> getAll();

    UserDTO findUser(Long id);
}
