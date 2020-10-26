package com.ewit.librarymanagement.libraryrepository.repositories;

import com.ewit.librarymanagement.librarymodel.models.BookQuantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookQuantityRepository extends JpaRepository<BookQuantity, Long> {
}
