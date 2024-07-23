package com.gc.GameRunner.Version4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner_v4 {
    private GamingConsole gc;


    @Autowired
    public GameRunner_v4(GamingConsole gc){
        this.gc=gc;
    }

    public void run(){
        System.out.println(gc.getClass()+" is running");
        gc.start();
    }
}
