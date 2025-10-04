package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.requestDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserDetailsById(int userId) {
        return userRepository.findById(userId);
    }

    public UserEntity saveUserDetails(UserDTO user) {

        UserEntity userObj = new UserEntity();
        userObj.setUserName(user.getUserName());
        userObj.setPassword(user.getPassword());
        userObj.setEmail(user.getEmail());
        userObj.setLastLoginTime(user.getLastLoginTime());
        userObj.setRegistrationDate(user.getRegistrationDate());
        userObj.setFirstName(user.getFirstName());
        userObj.setMiddleName(user.getMiddleName());
        userObj.setLastName(user.getLastName());
        userObj.setContactNo(user.getContactNo());

        return userRepository.save(userObj);
    }

    public List<UserEntity> getListOfData(List<UserDTO> user) {

        List<UserEntity> allListUserObj = new ArrayList<UserEntity>();

       //For Loop implimentation for update list of user data
        for(int i=0;i<user.size();i++){
            UserEntity listUserObj = new UserEntity();

            listUserObj.setUserName(user.get(i).getUserName());
            listUserObj.setPassword(user.get(i).getPassword());
            listUserObj.setEmail(user.get(i).getEmail());
            listUserObj.setLastLoginTime(user.get(i).getLastLoginTime());
            listUserObj.setRegistrationDate(user.get(i).getRegistrationDate());
            listUserObj.setFirstName(user.get(i).getFirstName());
            listUserObj.setMiddleName(user.get(i).getMiddleName());
            listUserObj.setLastName(user.get(i).getLastName());
            listUserObj.setContactNo(user.get(i).getContactNo());

            allListUserObj.add(listUserObj);
        }


        //forEach Loop implimentation for update list of user data
//         user.forEach(a->{
//             UserEntity listUserObj = new UserEntity();
//
//             listUserObj.setUserName(a.getUserName());
//             listUserObj.setPassword(a.getPassword());
//             listUserObj.setEmail(a.getEmail());
//             listUserObj.setLastLoginTime(a.getLastLoginTime());
//             listUserObj.setRegistrationDate(a.getRegistrationDate());
//             listUserObj.setFirstName(a.getFirstName());
//             listUserObj.setMiddleName(a.getMiddleName());
//             listUserObj.setLastName(a.getLastName());
//             listUserObj.setContactNo(a.getContactNo());
//
//             allListUserObj.add(listUserObj);
//         });

        return userRepository.saveAll(allListUserObj);
    }

    public UserEntity updateUserById(int userId, UserDTO user) {

        Optional<UserEntity> optionalUser = userRepository.findById(userId);

        UserEntity existingUser = optionalUser.get();

        existingUser.setUserName(user.getUserName());
        existingUser.setPassword(user.getPassword());
        existingUser.setLastLoginTime(user.getLastLoginTime());
        existingUser.setEmail(user.getEmail());
        existingUser.setRegistrationDate(user.getRegistrationDate());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setMiddleName(user.getMiddleName());
        existingUser.setLastName(user.getLastName());
        existingUser.setContactNo(user.getContactNo());

         return userRepository.save(existingUser);
    }


    public List<UserEntity> deleteUserById(int userId) {

        userRepository.deleteById(userId);
        return userRepository.findAll();
    }
}
