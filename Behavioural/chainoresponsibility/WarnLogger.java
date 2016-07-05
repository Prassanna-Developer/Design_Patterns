package com.learn.behavioral.chainofresponsibility;

public class WarnLogger extends AbstractLogger {

	@Override
	public void write(String msg) {
		System.out.println("WARN Logger >> " + msg);
	} 

}
