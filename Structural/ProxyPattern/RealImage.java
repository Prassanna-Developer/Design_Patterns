package com.learn.structural.proxypattern;

public class RealImage implements IImage {
	
	private String fileName;
	
	public RealImage(String name){
		this.fileName = name;
		loadImage();
	}
	
	

	private void loadImage() {
		System.out.println("Loading Image");
	}



	public void display() {
		System.out.println("Displaying File >>" + fileName);
		System.out.println();
		System.out.println();
	}

}
