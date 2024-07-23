package com.gc.GameRunner.Version4;


import org.springframework.stereotype.Component;

@Component
public class TicTacToe implements GamingConsole {
    @Override
    public void start() {
        System.out.println("Tic Tac Toe game starting......");
    }
}
