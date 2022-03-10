package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;


public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    PImage background;
    PImage bird;
    PImage topPipe;
    PImage bottomPipe;
    int x = 200;
    int y = 100;
    int birdYVelocity = -10;
    int birdGravity = 1;
    int pipeX = WIDTH;
    int upperPipeHeight = (int) random(100,400);
    int pipeGap = 105;
    int lowerPipeY;
    

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	background = loadImage("images/flappyBackground.jpg");
    	background.resize(WIDTH, HEIGHT);
    	bird = loadImage("images/bird.png");
    	bird.resize(75, 75);
    	topPipe = loadImage("images/topPipe.png");
    	bottomPipe = loadImage("images/bottomPipe.png");
    	
    }

    @Override
    public void draw() {
        background(background);
        image(bird, x, y);
        teleportPipes();
        y += birdYVelocity;
        birdYVelocity += birdGravity;
    }
    
    public void mousePressed() {
    	birdYVelocity = -10;
    }
    
    void teleportPipes() {
    	 image(topPipe, pipeX, -upperPipeHeight);
    	 image(bottomPipe, pipeX, lowerPipeY);
         pipeX -= 10;
         if(pipeX < 0) {
         	pipeX = WIDTH;
         	upperPipeHeight = (int) random(100,400);
         	lowerPipeY = upperPipeHeight + pipeGap;
         }
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
