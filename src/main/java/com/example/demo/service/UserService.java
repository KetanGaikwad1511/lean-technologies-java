package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public UserDTO getAllUser(){

        List<User> user = userRepository.findAll();
        if(!user.isEmpty()) {
            return new UserDTO.Builder()
            .userId(user.get(0).getUserId())
            .firstName(user.get(0).getFirstName())
            .lastName(user.get(0).getLastName())
            .build();
        }
         return new UserDTO.Builder().build();
        }
}
