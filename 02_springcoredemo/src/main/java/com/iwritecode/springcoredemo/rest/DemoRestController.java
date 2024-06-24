package com.iwritecode.springcoredemo.rest;

import com.iwritecode.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;

@Autowired
    public DemoRestController(@Qualifier("footBallCoach") Coach c){
    this.myCoach=c;
    System.out.println(myCoach);
    }
@Autowired
    public void setMyCoach(@Qualifier("cricketCoach") Coach c)
    {
        this.myCoach=c;
        System.out.println(myCoach);
    }

    @GetMapping("/advice/constructor")
    public String giveMeAdvice(){
        return myCoach.getAdvice();
    }

    public Coach getMyCoach() {
        return myCoach;
    }

    @GetMapping("/adivce/setters")
    public String giveMeSomeAdice(){
    return getMyCoach().getAdvice();
    }
}
