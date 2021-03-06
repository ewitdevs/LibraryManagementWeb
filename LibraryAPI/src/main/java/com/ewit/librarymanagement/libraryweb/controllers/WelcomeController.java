package com.ewit.librarymanagement.libraryweb.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class WelcomeController {

    @Value("${app.welcome.message}")
    private String message = "";
    @Value("${app.welcome.title}")
    private String title = "";

    @GetMapping
    public ModelAndView welcome(ModelAndView modelAndView){
        modelAndView.addObject("title", title);
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

}
