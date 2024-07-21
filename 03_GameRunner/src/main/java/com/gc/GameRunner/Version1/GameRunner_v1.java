package com.gc.GameRunner.Version1;

public class GameRunner_v1 {
    private SuperContra game;

    public GameRunner_v1(SuperContra sc) {
        this.game=sc;
    }
    public void run(){
        System.out.println(game.getClass()+" is running");
        game.start();
    }
}
