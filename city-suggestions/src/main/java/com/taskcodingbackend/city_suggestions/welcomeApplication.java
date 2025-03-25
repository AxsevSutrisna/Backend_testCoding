package com.taskcodingbackend.city_suggestions;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class welcomeApplication {
    
    @GetMapping("/welcome")    
    public String welcome() {
        return "Welcome to the City Suggestions API";
    }

}
