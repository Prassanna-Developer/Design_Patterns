package com.learn.behavioral.command;

public class CommandPatternDemo {
	
	public static void main(String[] args) {
		System.out.println("CommandPatternDemo.main()");
		Stock stock = new Stock("SBI ", 20);
		
		Order buyIT = new BuyStock(stock);
		Order sellIT = new SellStock(stock);
		
		Broker broker = new Broker();
		broker.takeOrders(buyIT);
		broker.takeOrders(sellIT);
		
		
		broker.placeOrders();
	}

}
