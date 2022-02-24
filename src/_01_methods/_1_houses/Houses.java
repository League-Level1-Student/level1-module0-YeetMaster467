package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	
	static Robot rob = new Robot("mini");
	
	public void run() {
		// Check the recipe to find out what code to put here
		Random ran = new Random();
		int x;
		rob.moveTo(25, 500);
		rob.setSpeed(10);
		
		for(int i=0; i<12; i++) {
			x = ran.nextInt(3);
			if(x == 0) {
				drawHouse("random", "small");
			}else if(x == 1) {
				drawHouse("random", "medium");
			}else {
				drawHouse("random", "large");
			}
		}
		
	}
	
	void drawHouse(String color, String height) {
		
		rob.setAngle(0);
		
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}else if(color.equalsIgnoreCase("orange")) {
			rob.setPenColor(Color.orange);
		}else if(color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.yellow);
		}else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		}else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}else if(color.equalsIgnoreCase("magenta")) {
			rob.setPenColor(Color.magenta);
		}else {
			rob.setRandomPenColor();
		}
		
		if(height.equalsIgnoreCase("small")) {
			rob.penDown();
			rob.move(60);
			drawPointyRoof();
			rob.move(60);
			rob.turn(270);
			rob.setPenColor(100,150,100);
			rob.move(25);
		}else if(height.equalsIgnoreCase("medium")) {
			rob.penDown();
			rob.move(120);
			drawPointyRoof();
			rob.move(120);
			rob.turn(270);
			rob.setPenColor(100,150,100);
			rob.move(25);
		}else if(height.equalsIgnoreCase("large")) {
			rob.penDown();
			rob.move(250);
			drawFlatRoof();
			rob.move(250);
			rob.turn(270);
			rob.setPenColor(100,150,100);
			rob.move(25);
		}else {
			System.out.println("Error. Height not specified.");
		}
	}
	
	void drawFlatRoof() {
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}
	
	void drawPointyRoof() {
		rob.turn(60);
		rob.move(25);
		rob.turn(60);
		rob.move(25);
		rob.turn(60);
	}
}
