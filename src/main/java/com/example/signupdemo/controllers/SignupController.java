package com.example.signupdemo.controllers;

import com.example.signupdemo.dto.UserDTO;
import com.example.signupdemo.models.User;
import com.example.signupdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SignupController {

    @Autowired
    public UserService userService;

    @PostMapping()
     public ResponseEntity<User> signup(@RequestBody UserDTO userDTO){

        if(userDTO == null) {
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        User save = userService.save(userDTO);
        return new ResponseEntity<User>(save, HttpStatus.CREATED);
    }


}
