package com.learn.structural.flyweightPattern;

public class Circle implements IShape {
	
	private int xPos;
	private int yPos;
	
	public static int count = 0;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private String color;
	
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	private int radius;


	public Circle(String color) {
		this.color = color;
		count++;
	}

	public String toString() {
		return "Circle [xPos=" + xPos + ", yPos=" + yPos + ", radius=" + radius
				+ "]";
	}

	public void draw() {
		System.out.println("Circle [xPos=" + xPos + ", yPos=" + yPos + ", radius=" + radius
				+ "]");
	}
	
	
	
	
	

}
