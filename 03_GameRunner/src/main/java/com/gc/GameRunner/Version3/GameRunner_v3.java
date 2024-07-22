package com.gc.GameRunner.Version3;

public class GameRunner_v3 {
    private GamingConsole gc;
    public GameRunner_v3(GamingConsole gc){
        this.gc=gc;
    }

    public void run(){
        System.out.println(gc.getClass()+" is running");
        gc.start();
    }
}
