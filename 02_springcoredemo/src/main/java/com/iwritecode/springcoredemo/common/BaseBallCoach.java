package com.iwritecode.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
// This is neither being injected by Setter or Constructor ..hence this bean will be avoided since we have Lazy initialized
public class BaseBallCoach implements Coach {
    public BaseBallCoach() {
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getAdvice() {
        return "Play Baseball daily for 3 hrs";
    }
}
