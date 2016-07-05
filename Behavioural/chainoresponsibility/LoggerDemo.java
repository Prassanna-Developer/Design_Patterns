package com.learn.behavioral.chainofresponsibility;

public class LoggerDemo {
	
	
	public static void main(String[] args) {
		AbstractLogger errorLogger = new ErrorLogger();
		AbstractLogger infoLogger = new InfoLogger();
		AbstractLogger debugLogger = new DebugLogger();
		
		errorLogger.setNextLogger(debugLogger);
		infoLogger.setNextLogger(errorLogger);
		
		errorLogger.logMessage("!!!ERROR !!!");
		
		System.out.println("--------------------------------------");
		
		infoLogger.logMessage("!!!INFO !!!");
		
	
	}

}
