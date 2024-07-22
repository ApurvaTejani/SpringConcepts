package com.gc.GameRunner.Version3;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    @Bean (name="setPacManGame")
    public GamingConsole setPacManGame(){
        return  new PacMan();
    }
    @Bean (name="setTicTacToe")
    public GamingConsole setTicTacToe(){
        return  new TicTacToe();
    }


    @Bean(name="plugGame1")
    public GameRunner_v3 plugGame(){
        GameRunner_v3 v3= new GameRunner_v3(setTicTacToe());
        return v3;
    }
}
