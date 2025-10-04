package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.requestDTO.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUserDetails")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/getUserDetails/{byUserId}")
    public Optional<UserEntity> getUserDetailsById(@PathVariable int UserId) {
        return userService.getUserDetailsById(UserId);
    }

    @PostMapping("/saveUserDetails")
    public UserEntity saveUserDetails(@RequestBody UserDTO user) {
        UserEntity saveData =  userService.saveUserDetails(user);
        return saveData;
    }

    @PostMapping("/savelistOfUserDetails")
    public List<UserEntity> getListOfData(@RequestBody List<UserDTO> user){
        List<UserEntity> saveListOfData= userService.getListOfData(user);
        return saveListOfData;
    }

    @PutMapping("/updateUserById/{UserId}")
    public UserEntity updateUserById(@PathVariable int UserId,@RequestBody UserDTO user){
        return userService.updateUserById(UserId,user);
    }
    
    @DeleteMapping("deleteUserById/{UserId}")
    public  List<UserEntity> deleteUserById (@PathVariable int UserId){
        return userService.deleteUserById(UserId);
    }

}
