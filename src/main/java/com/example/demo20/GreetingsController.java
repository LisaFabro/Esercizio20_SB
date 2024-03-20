package com.example.demo20;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingsController {
    @Value("${application.welcomeMsg}")
    private String welcomeMsg;
    @GetMapping
    public String greetings(){
        return welcomeMsg;
    }
}
