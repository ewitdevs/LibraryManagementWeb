package com.ewit.librarymanagement.librarybl.service;

import com.ewit.librarymanagement.librarydto.model.BookDTO;
import com.ewit.librarymanagement.librarydto.model.BookRequest;

public interface BookService {

    BookDTO saveBook(BookRequest request);
}
