package com.learn.behavioral.chainofresponsibility;

public class DebugLogger extends AbstractLogger {

	@Override
	public void write(String msg) {
		System.out.println("DEBUG Logger >> " + msg);
	} 

}
