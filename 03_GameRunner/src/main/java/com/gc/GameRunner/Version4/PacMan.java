package com.gc.GameRunner.Version4;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole {

    @Override
    public void start() {
        System.out.println("Pac Man game starting......");
    }
}
