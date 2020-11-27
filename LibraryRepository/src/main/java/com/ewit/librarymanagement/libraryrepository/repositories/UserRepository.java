package com.ewit.librarymanagement.libraryrepository.repositories;

import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.librarymodel.models.UserType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAllByType(UserType userType);

    List<User> findAllByTypeNot(UserType userType);

    Optional<User> findByName(String name);

    Page<User> findAllByType(UserType userType, Pageable pageable);

    Page<User> findAllByTypeNot(UserType userType, Pageable pageable);
}
