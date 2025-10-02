package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/ourProject")
    public String welcomeToClass(){
        return "Welcome to our classes";
    }

    @GetMapping("/about")
    public  String about(){
        return "this is project is for java spring boot application development";
    }

}
