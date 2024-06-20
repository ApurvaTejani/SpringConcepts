package com.firstproject.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppRestController {

    @Value("${first.name}")
    private String firstName;
    @GetMapping
    public String sayHello(){
        return firstName+" Tejani";
        }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run daily and stay fit";

    }
}
