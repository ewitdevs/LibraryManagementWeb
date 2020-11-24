package com.ewit.librarymanagement.libraryweb.controllers;

import com.ewit.librarymanagement.librarybl.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor()
public class UserController {

    private final UserService service;


}
