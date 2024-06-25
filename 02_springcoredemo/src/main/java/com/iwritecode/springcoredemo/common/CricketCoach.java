package com.iwritecode.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getAdvice() {

        return "Practice fast bowling for 15 mins";
    }
}
