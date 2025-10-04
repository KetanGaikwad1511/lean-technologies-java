package com.example.demo.dto;

import lombok.Data;

@Data
public class UserDTO {
    Long userId;
    String firstName;
    String middleName;
    String lastName;
    Long contactNo;
    String email;
    String password;

    private UserDTO(UserDTO.Builder builder) {
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.contactNo = builder.contactNo;
        this.email = builder.email;
        this.password = builder.password;
    }



    public static class Builder {
        private Long userId;
        private String firstName;
        private String middleName;
        private String lastName;
        private Long contactNo;
        private String email;
        private String password;

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder contactNo(Long contactNo) {
            this.contactNo = contactNo;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }



        public UserDTO build() {
            // Optional: Add validation logic here before building the Product
            if (userId==null) {
                throw new IllegalArgumentException("User Id cannot be null or empty.");
            }
            return new UserDTO(this);
        }
    }

}
