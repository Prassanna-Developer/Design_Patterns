package com.learn.structural.facadepattern;

public class ShapeMaker {

	
	private Circle circle;
	private Rectangle rectangle;
	
	public ShapeMaker(Circle circle, Rectangle rectangle) {
		super();
		this.circle = circle;
		this.rectangle = rectangle;
	}
	
	public void draw(){
		System.out.println("ShapeMaker.draw()");
		circle.draw();
		rectangle.draw();
	}
	
	
	
}
