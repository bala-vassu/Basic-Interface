package com.course.udemy;

public class GameRunner {
    private gammingconsole game;
    public GameRunner(gammingconsole game) {
        this.game=game;
    }
    public void run( ){
        System.out.println("Running game : "+game.toString());
        game.right();
        game.up();
        game.down();
        game.left();

    }
//    private MarioGame game;
//    public GameRunner(MarioGame game) {
//       this.game=game;
//    }
//    public void run( ){
//        System.out.println("Running game : "+game.toString());
//        game.right();
//        game.up();
//        game.down();
//        game.left();
//
//    }
}
