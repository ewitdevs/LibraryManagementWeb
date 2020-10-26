package com.ewit.librarybl.service;

import com.ewit.librarybl.core.BasicService;
import com.ewit.librarydto.model.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends BasicService<UserDTO, Long> {
}
