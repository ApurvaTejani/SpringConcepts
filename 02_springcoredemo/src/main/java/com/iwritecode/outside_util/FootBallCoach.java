package com.iwritecode.outside_util;

import com.iwritecode.springcoredemo.common.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//Making this Bean Scope as prototype
@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FootBallCoach implements Coach {
    public FootBallCoach() {

        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getAdvice() {

        return "Practice Goal for 10 mins";
    }


}
