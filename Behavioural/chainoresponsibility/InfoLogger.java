package com.learn.behavioral.chainofresponsibility;

public class InfoLogger extends AbstractLogger {

	@Override
	public void write(String msg) {
		System.out.println("INFO Logger >> " + msg);
	} 

}
