package com.iwritecode.outside_util;

import com.iwritecode.springcoredemo.common.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootBallCoach implements Coach {
    public FootBallCoach() {
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getAdvice() {

        return "Practice Goal for 10 mins";
    }
}
