package com.ewit.librarymanagement.libraryconverter.converter;

import com.ewit.librarymanagement.libraryconverter.core.Converter;
import com.ewit.librarymanagement.librarydto.model.UserDTO;
import com.ewit.librarymanagement.librarymodel.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends Converter<UserDTO, User> {

    public UserConverter() {
       super(UserDTO::toModel,UserDTO::fromModel);
    }

}
