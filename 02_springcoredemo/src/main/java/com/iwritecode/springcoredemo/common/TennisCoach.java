package com.iwritecode.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach{

    @Override
    public String getAdvice() {

        return "Play Tennis Daily for 2 hrs";
    }
}
