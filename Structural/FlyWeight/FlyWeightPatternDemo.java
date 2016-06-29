package com.learn.structural.flyweightPattern;


public class FlyWeightPatternDemo {
	
	private String[] colors = {"red","blue","green","yellow","brown","orange","violet"};
	

	public static void main(String[] args) {
		ShapeDemo shapeDemo = new ShapeDemo();
		FlyWeightPatternDemo demo = new FlyWeightPatternDemo();
		
		for(int i=0;i<20;i++){
		Circle circle = shapeDemo.getShape(demo.getRandomColor());
		circle.setxPos(demo.getX());
		circle.setyPos(demo.getY());
		circle.setRadius(demo.getRandomRadius());
		circle.draw();
		}
		System.out.println("Total Count of Circle is >> " + Circle.count);
	}
	
	
	
	private String getRandomColor() {
		return  colors[(int)(Math.random() * colors.length-1)];
	}

	private int getRandomRadius() {
		return (int) (Math.random() * 100);
	}

	private int getY() {
		return (int) (Math.random() * 100);
	}

	private int getX() {
		return (int) (Math.random() * 100);
	}


}
