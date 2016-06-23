package com.learn.structural.decoratorpattern;

public class RedShapeDecorator extends AbstractShapeDecorator {

	public RedShapeDecorator(IShape shape) {
		super(shape);
	}

	public void draw() {
		System.out.println("Apply red color to shape");
		super.draw();
	}

}
