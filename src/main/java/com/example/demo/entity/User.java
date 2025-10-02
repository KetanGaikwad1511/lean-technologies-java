package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Table(name = "user_details")
public class User {
    public User() {
    }

    private User(Builder builder) {
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.contactNo = builder.contactNo;
        this.email = builder.email;
        this.password = builder.password;
    }
     @Id
    Long userId;
    String firstName;
    String middleName;
    String lastName;
    Long contactNo;
    String email;
    String password;

    public static class Builder {
        Long userId;
        String firstName;
        String middleName;
        String lastName;
        Long contactNo;
        String email;
        String password;

        public User build() {
            // Optional: Add validation logic here before building the Product
            if (userId==null) {
                throw new IllegalArgumentException("User Id cannot be null or empty.");
            }
            return new User(this);
        }
    }

}
