package com.learn.structural.bridgepattern;

public class Circle extends Shape {
	
	private int radius;
	private int x;
	private int y;

	public Circle(DrawAPI draw,int radius,int x, int y) {
		super(draw);
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		drawAPI.draw(radius, x, y);
	}

}
