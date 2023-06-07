package com.course.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemyApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyApplication.class, args);
		//var	game= new MarioGame();  //creating Object for MrioGame class (for TIGHTLY COUPLED)
		var game=new SuperContraGame(); //Exaple of LOOSLY coupling
		var gameRunner = new GameRunner(game);  //creating Object for GameRunner class & pasing parameter as mario gmae object
		gameRunner.run();	//Calling run method in GameRunner Class
	}

}
