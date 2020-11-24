package com.ewit.librarymanagement.librarybl.service.impl;

import com.ewit.librarymanagement.librarybl.service.BookService;
import com.ewit.librarymanagement.librarydto.model.BookDTO;
import com.ewit.librarymanagement.librarydto.model.BookRequest;
import com.ewit.librarymanagement.libraryrepository.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    @Override
    public BookDTO saveBook(BookRequest request) {

       return null;
    }
}
