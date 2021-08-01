package com.example.signupdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class UserDTO {

    private String firstName;
    private String lasnName;
    private String userId;
    private String phoneNumber;
    private String email;
    private String password;
}
