package com.learn.structural.facadepattern;

public class FacadePatternDemo {
	
	
	public static void main(String[] args) {
		System.out.println("FacadePatternDemo.main()");
		ShapeMaker maker = new ShapeMaker(new Circle(), new Rectangle());
		
		maker.draw();
	}

}
