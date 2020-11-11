package com.ewit.librarymanagement.librarybl.service.impl;

import com.ewit.librarymanagement.librarybl.service.InitUserService;
import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.librarymodel.models.UserType;
import com.ewit.librarymanagement.libraryrepository.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InitUserServiceImpl implements InitUserService {

    @Value("${secure.username}")
    private String username;

    @Value("${secure.default-password}")
    private String defaultPassword;

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void initializeUser() {
        List<User> users = repository.findAllByType(UserType.ADMIN);
        if(users.isEmpty()){
            addAdminUser();
        }
    }


    private void addAdminUser() {
        User admin1 = User.builder()
                .canLogin(true)
                .firstName(username)
                .lastName("1")
                .password(passwordEncoder.encode(defaultPassword))
                .type(UserType.ADMIN)
                .name(username+1)
                .build();
        User admin2 = User.builder()
                .canLogin(true)
                .firstName(username)
                .lastName("2")
                .password(passwordEncoder.encode(defaultPassword))
                .type(UserType.ADMIN)
                .name(username+2)
                .build();
        repository.save(admin1);
        repository.save(admin2);
    }
}
