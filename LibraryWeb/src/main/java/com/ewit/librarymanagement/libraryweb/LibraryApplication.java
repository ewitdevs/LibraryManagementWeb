package com.ewit.libraryweb;

import com.ewit.librarymanagement.librarybl.service.InitUserService;
import com.ewit.libraryweb.initialize.AdminUserInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ewit.librarymanagement.*")
@ComponentScan(basePackages = {"com.ewit.librarymanagement.*"})
@EnableJpaRepositories(basePackages = {"com.ewit.librarymanagement.libraryrepository.*"})
@EntityScan("com.ewit.librarymanagement.librarymodel.models")
public class LibraryApplication {

    @Autowired
    AdminUserInitializer

    public LibraryApplication(InitUserService initUserService) {
        this.initUserService = initUserService;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);

    }


}
