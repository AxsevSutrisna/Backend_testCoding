package com.taskcodingbackend.city_suggestions;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class welcomeApplication {
    
    @GetMapping("/welcome")    
    public String welcome() {
        return "Ini adalah contoh untuk REST API Spring Boot";
    }

    @GetMapping("/welcomeSpring")    
    public String welcomeSpring() {
        return "Spring Boot is working!";
    }

}
