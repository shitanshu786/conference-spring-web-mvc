package com.pluralsight.conferencespringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting( Map<String, Object> model){
        model.put("message", "Hello Shittu!");
        return "greeting";
    }
    // For thymeleaf controller
    /*@GetMapping("thyme")
    public String thyme( Map<String, Object> model){
        model.put("message", "Hello Thymeleaf");
        return "thyme";
    }*/

}
