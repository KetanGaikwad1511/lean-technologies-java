package com.example.demo.requestDTO;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    public String UserName;
    public String ContactNo;
    public String Password;
    public Date LastLoginTime;
    public String Email;
    public Date RegistrationDate;
    public String FirstName;
    public String MiddleName;
    public String LastName;

}
