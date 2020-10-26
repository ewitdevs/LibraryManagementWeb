package com.ewit.librarymanagement.libraryrepository.repositories;

import com.ewit.librarymanagement.librarymodel.models.BookQuantityLent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookQuantityLentRepository extends JpaRepository<BookQuantityLent, Long> {
}
