package com.gc.GameRunner;

import com.gc.GameRunner.Version1.GameRunner_v1;
import com.gc.GameRunner.Version1.SuperContra;
import com.gc.GameRunner.Version2.GameRunner_v2;
import com.gc.GameRunner.Version2.MarioGame;
import com.gc.GameRunner.Version3.GameConfig;
import com.gc.GameRunner.Version3.GameRunner_v3;
import com.gc.GameRunner.Version4.GameRunner_v4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Configuration
@ComponentScan("com.gc.GameRunner.Version4")
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

        // Version3 - With Game Config class it gets more complicated
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(GameConfig.class);
        ap.getBean("setTicTacToe");
        GameRunner_v3 v3=(GameRunner_v3) ap.getBean("plugGame1");
        v3.run();



        AnnotationConfigApplicationContext ap1 = new AnnotationConfigApplicationContext(GameRunnerApplication.class);
        ap1.getBean(GameRunner_v4.class).run();

    }
}
