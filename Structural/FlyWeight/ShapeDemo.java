package com.learn.structural.flyweightPattern;

import java.util.HashMap;

public class ShapeDemo {
	
	private HashMap<String, IShape> map = new HashMap<String, IShape>();
	
	
	public Circle getShape(String color ){
		
		Circle circle = (Circle) map.get(color);
		
		if(circle == null){
			circle = new Circle(color);
			map.put(color, circle);
			System.out.println("Created Circle of color >> " + color);
		}
		
		return circle;
		
	}

	
}
