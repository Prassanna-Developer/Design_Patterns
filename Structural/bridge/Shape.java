package com.learn.structural.bridgepattern;

public abstract class Shape {
	
	protected DrawAPI drawAPI;
	
	public Shape(DrawAPI draw){
		this.drawAPI = draw;
	}
	
	public abstract void draw();

}
