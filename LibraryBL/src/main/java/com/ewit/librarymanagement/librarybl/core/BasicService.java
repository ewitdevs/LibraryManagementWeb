package com.ewit.librarybl.core;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BasicService<T, PK> {

    List<T> findAll();
    Optional<T> findById(PK id);
    Optional<T> save(PK id);
    Optional<T> update(T t, PK id);
    boolean delete(T t);
    boolean deleteById(PK id);
}
