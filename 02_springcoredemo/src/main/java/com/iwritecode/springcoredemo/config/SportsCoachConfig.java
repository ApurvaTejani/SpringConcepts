package com.iwritecode.springcoredemo.config;

import com.iwritecode.springcoredemo.common.BaseBallCoach;
import com.iwritecode.springcoredemo.common.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// This particular class configs BaseBall Coach
@Configuration
public class SportsCoachConfig {
    @Bean
    public Coach getBaseBallCoach(){
        return  new BaseBallCoach();
    }
}
