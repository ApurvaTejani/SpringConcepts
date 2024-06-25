package com.iwritecode.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getAdvice() {

        return "Play Tennis Daily for 2 hrs";
    }
}
