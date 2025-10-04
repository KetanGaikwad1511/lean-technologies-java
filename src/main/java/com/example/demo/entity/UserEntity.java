package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "UserDetails")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;
    private String UserName;
    private String Password;
    private Date LastLoginTime;
    private String Email;
    private Date RegistrationDate;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String ContactNo;

    public UserEntity() {
        // Default constructor required by Hibernate
    }

    @PrePersist
    protected void onCreate() {
        RegistrationDate = new Date();
    }
}
