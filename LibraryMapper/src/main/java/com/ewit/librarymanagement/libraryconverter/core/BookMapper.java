package com.ewit.librarymanagement.libraryconverter.core;

import com.ewit.librarymanagement.librarydto.model.BookDTO;
import com.ewit.librarymanagement.librarymodel.models.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(target = "id" , source = "id")
    @Mapping(target = "title", source = "title")
    BookDTO mapToDTO(Book book);

}
