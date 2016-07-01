package com.learn.structural.proxypattern;

public class ProxyDemo {
	
	public static void main(String[] args) {
		IImage image = new ProxyImage("1.mp3");
		
		image.display();
		
		System.out.println("");
		System.out.println("");
		
		image.display();
	}

}
