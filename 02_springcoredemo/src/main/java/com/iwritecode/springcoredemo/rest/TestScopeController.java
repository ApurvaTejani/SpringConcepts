package com.iwritecode.springcoredemo.rest;

import com.iwritecode.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestScopeController {
    private Coach c1;
    private Coach c2;

    @Autowired
    public TestScopeController(@Qualifier("footBallCoach") Coach fc1, @Qualifier("footBallCoach") Coach fc2){
                    c1=fc1;
                    c2=fc2;
    }

//    System.out.println(c1+"  "+c2);
    @GetMapping("/check")
    public String getBeanScopeCheck(){
        return  c1+ "<br>"+c2;
    }
}
