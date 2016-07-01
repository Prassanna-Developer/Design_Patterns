package com.learn.structural.proxypattern;

public class ProxyImage implements IImage {

	RealImage realImage = null;
	private String fileName = "";
	
	public ProxyImage(String fileName){
		this.fileName = fileName;
	}
	
	public void display() {
		if(realImage == null)
			realImage = new RealImage(fileName);
		realImage.display();
	}

}
