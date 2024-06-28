package com.iwritecode.springcoredemo.rest;

import com.iwritecode.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestScopeController {
    private Coach fc1;
    private Coach fc2;

    private Coach bc;

    @Autowired
    public TestScopeController(@Qualifier("footBallCoach") Coach fc1, @Qualifier("footBallCoach") Coach fc2){
                    this.fc1=fc1;
                    this.fc2=fc2;
    }

//    System.out.println(c1+"  "+c2);
    @GetMapping("/check")
    public String getBeanScopeCheck(){
        System.out.println("If true then Singelon, if false then Prototype -->"+(fc1==fc2));
        return  fc1+ "<br>"+fc2;
    }

   @Autowired
    public void setCoach(@Qualifier("getBaseBallCoach") Coach bc){
            this.bc=bc;
    }
    @GetMapping("/baseball")
    public String giveMeAdvice(){
        return bc.getAdvice();
    }
}
