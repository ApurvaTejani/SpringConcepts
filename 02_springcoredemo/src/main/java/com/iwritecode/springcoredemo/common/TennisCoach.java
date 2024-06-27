package com.iwritecode.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartUpStuff(){
        System.out.println("In doStartUpStuff() "+getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanUpStuff(){
        System.out.println("In doCleanUpStuff() "+getClass().getSimpleName());
    }
    @Override
    public String getAdvice() {

        return "Play Tennis Daily for 2 hrs";
    }
}
