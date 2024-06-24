package com.iwritecode.springcoredemo.rest;

import com.iwritecode.springcoredemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;

@Autowired
    public DemoRestController( Coach c){
        this.myCoach=c;
    }

    @GetMapping("/advice")
    public String Advice(){
        return myCoach.getAdvice();
    }
}
