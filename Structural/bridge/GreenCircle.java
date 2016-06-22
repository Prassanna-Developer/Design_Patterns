package com.learn.structural.bridgepattern;

public class GreenCircle implements DrawAPI {

	public void draw(int radius, int x, int y) {
		System.out.println("Green Circle >>> radius > " + radius + "..x > " + x + "...y > " + y);
	}

}
 