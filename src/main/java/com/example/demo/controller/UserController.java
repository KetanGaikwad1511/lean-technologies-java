package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/getAllUser")
    public UserDTO getUser(){
        return userService.getAllUser();
    }

    @PostMapping("/addUser")
    public UserEntity createUer(@RequestBody UserEntity user){
        return userService.addUser(user);
    }

}
