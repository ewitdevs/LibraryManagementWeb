package com.ewit.librarymanagement.libraryweb.initialize;

import com.ewit.librarymanagement.librarybl.service.InitUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdminUserInitializer implements CommandLineRunner {

    private final InitUserService initUserService;

    public AdminUserInitializer(InitUserService initUserService) {
        this.initUserService = initUserService;
    }


    @Override
    public void run(String... args) throws Exception {
        initUserService.initializeUser();
    }
}
