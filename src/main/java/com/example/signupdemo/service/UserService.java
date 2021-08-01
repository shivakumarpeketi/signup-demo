package com.example.signupdemo.service;

import com.example.signupdemo.dto.UserDTO;
import com.example.signupdemo.models.User;
import com.example.signupdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(UserDTO userDTO){
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLasnName(userDTO.getLasnName());
        user.setUserId(userDTO.getUserId());
        user.setEmail(userDTO.getEmail());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setPassword(userDTO.getPassword());
        user = userRepository.save(user);
        return user;
    }
}
