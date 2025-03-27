package com.media_app.registration.controller;

import com.media_app.registration.model.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @GetMapping("/getUser")
    public UserDetails getUser(){
        UserDetails user=new UserDetails();
        user.setUserName("abi");
        user.setPassword("324325");
        user.setEmailAddress("sample@gmail.com");
        user.setMobileNum("8768788");
        return user;
    }
}
