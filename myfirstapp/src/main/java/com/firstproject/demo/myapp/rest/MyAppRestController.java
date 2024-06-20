package com.firstproject.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppRestController {
    @GetMapping
    public String sayHello(){

        return "Hello People";
    }
}