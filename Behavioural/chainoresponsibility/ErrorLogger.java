package com.learn.behavioral.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

	@Override
	public void write(String msg) {
		System.out.println("ERROR Logger >> " + msg);
	} 

}
