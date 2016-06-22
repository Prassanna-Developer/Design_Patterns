package com.learn.structural.bridgepattern;

public class BridgePatternDemo {
	
	public static void main(String[] args) {
		DrawAPI greenCircle = new GreenCircle();
		DrawAPI redCircle = new RedCircle();
		
		Shape circle1 = new Circle(greenCircle, 20, -2, -4);
		
		Shape circle2 = new Circle(redCircle, 200, -20, -40);
		
		circle1.draw();
		circle2.draw();
		
	
	}

}
