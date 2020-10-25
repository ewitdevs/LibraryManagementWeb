package com.ewit.librarymanagement.libraryrepository.repositories;

import com.ewit.librarymanagement.librarymodel.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
