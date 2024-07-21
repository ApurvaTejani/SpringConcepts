package com.gc.GameRunner.Version2;

public class GameRunner_v2 {
    private GamingConsole gc;
    public GameRunner_v2(GamingConsole gc){
        this.gc=gc;
    }
    public void run(){
        System.out.println(gc.getClass()+" is running");
        gc.start();
    }
}
