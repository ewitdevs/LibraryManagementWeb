package com.ewit.librarymanagement.librarybl.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public interface InitUserService {
    void initializeUser();
}
