package com.pluralsight.conferencespringmvc.controllers;

import com.pluralsight.conferencespringmvc.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam( value="firstName", defaultValue="Shittu") String firstName,
                        @RequestParam( value="lastName", defaultValue="Verma") String lastName,
                        @RequestParam( value="age", defaultValue="43") int age){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postuser(User user){
        return user;
    }
}
