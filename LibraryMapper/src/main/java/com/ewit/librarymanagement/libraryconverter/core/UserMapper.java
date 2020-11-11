package com.ewit.librarymanagement.libraryconverter.core;

import com.ewit.librarymanagement.librarydto.model.UserDTO;
import com.ewit.librarymanagement.librarymodel.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "type", source = "type")
    @Mapping(target = "year", source = "year")
    @Mapping(target = "firstName", source ="firstName")
    @Mapping(target = "lastName", source ="lastName")
    @Mapping(target = "canLogin", constant = "false")
    @Mapping(target = "allowedBooks", source = "allowedBooks")
    @Mapping(target = "usnOrId", source = "usnOrId")
    User map(UserDTO userDTO);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "type", source = "type")
    @Mapping(target = "year", source = "year")
    @Mapping(target = "firstName", source ="firstName")
    @Mapping(target = "lastName", source ="lastName")
    @Mapping(target = "allowedBooks", source = "allowedBooks")
    @Mapping(target = "usnOrId", source = "usnOrId")
    UserDTO mapToDTO(User user);
}
