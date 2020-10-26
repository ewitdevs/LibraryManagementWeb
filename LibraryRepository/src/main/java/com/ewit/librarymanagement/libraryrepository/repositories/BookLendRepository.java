package com.ewit.librarymanagement.libraryrepository.repositories;

import com.ewit.librarymanagement.librarymodel.models.BookLend;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookLendRepository extends JpaRepository<BookLend, Long> {
}
