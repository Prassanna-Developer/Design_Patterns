package com.learn.behavioral.chainofresponsibility;

public abstract class AbstractLogger {
	
	public enum LOGGERS {WARN,DEBUG,INFO,ERROR};
	
	private AbstractLogger nextLogger = null;

	public AbstractLogger getNextLogger() {
		return nextLogger;
	}

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(String msg){
		
		write(msg);
		
		if(nextLogger!=null)
			nextLogger.logMessage( msg);
		
	}
	
	
	
	public abstract void write(String msg);
}
