package com.iwritecode.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getAdvice() {
        return "Practice fast bowling for 15 mins";
    }
}
