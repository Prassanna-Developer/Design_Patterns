package com.learn.structural.decoratorpattern;

public abstract class AbstractShapeDecorator implements IShape{
	
	
	protected IShape shape;

	public AbstractShapeDecorator(IShape shape) {
		super();
		this.shape = shape;
	}

	public void draw() {
		
		shape.draw();
		
	}

}
