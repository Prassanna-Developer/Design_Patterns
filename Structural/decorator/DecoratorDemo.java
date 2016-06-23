package com.learn.structural.decoratorpattern;

public class DecoratorDemo {

	public static void main(String[] args) {
		System.out.println("DecoratorDemo.main()");
		AbstractShapeDecorator decorator = new RedShapeDecorator(new Circle());
		decorator.draw();
		System.out.println("--------------");
		
		AbstractShapeDecorator decorator2 = new RedShapeDecorator(new Rectangle());
		decorator2.draw();
		
		System.out.println("---- NORMAL ---");
		IShape shape = new Circle();
		shape.draw();
	}

}
