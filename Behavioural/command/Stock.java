package com.learn.behavioral.command;

public class Stock {

	private String name = "SBI [Magna]";
	private int quantity = 100;
	
	
	
	public void buyStock(){
		System.out.println("Bought Stock : " + name + ".. Quantity : " + quantity);
	}
	
	
	public Stock(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}


	public void sellStock(){
		System.out.println("Selling Stock : " + name + ".. Quantity : " + quantity);
	}
}
