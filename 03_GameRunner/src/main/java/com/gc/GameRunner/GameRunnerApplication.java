package com.gc.GameRunner;

import com.gc.GameRunner.Version1.GameRunner_v1;
import com.gc.GameRunner.Version1.SuperContra;
import com.gc.GameRunner.Version2.GameRunner_v2;
import com.gc.GameRunner.Version2.MarioGame;

public class GameRunnerApplication {
    public static void main(String[] args) {

        // Version 1 - Tight Coupling No use of Interface
        SuperContra sc = new SuperContra();
        GameRunner_v1 v1 = new GameRunner_v1(sc);
        v1.run();
        // Version 2 - Loose Coupling using Interface
        MarioGame marioGame = new MarioGame(); // Object Creation
        GameRunner_v2 v2 = new GameRunner_v2(marioGame); // Object Creation + Wiring of Dependencies i.e DI
        v2.run();




    }
}
