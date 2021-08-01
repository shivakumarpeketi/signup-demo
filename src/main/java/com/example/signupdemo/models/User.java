package com.example.signupdemo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Builder
@Entity
@NoArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lasnName;
    private String userId;
    private String phoneNumber;
    private String email;
    private String password;
}
