package com.iwritecode.outside_util;

import com.iwritecode.springcoredemo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {
    @Override
    public String getAdvice() {
        return "Practice Goal for 10 mins";
    }
}
