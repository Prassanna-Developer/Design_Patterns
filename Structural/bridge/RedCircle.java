package com.learn.structural.bridgepattern;

public class RedCircle implements DrawAPI {

	public void draw(int radius, int x, int y) {
		System.out.println("Red Circle Drawn x> " +x + "...y " + y +"... radius > " + radius);
	} 

}
