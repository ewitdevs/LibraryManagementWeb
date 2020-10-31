package com.ewit.librarymanagement.libraryrepository.repositories;

import com.ewit.librarymanagement.librarymodel.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
