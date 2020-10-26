package com.ewit.librarymanagement.libraryweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ewit.librarymanagement.*")
@ComponentScan(basePackages = {"com.ewit.librarymanagement.*"})
@EnableJpaRepositories(basePackages = {"com.ewit.librarymanagement.libraryrepository.*"})
@EntityScan("com.ewit.librarymanagement.librarymodel.models")
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);

    }


}
