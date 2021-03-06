package com.learn.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	List<Order> orders = new ArrayList<Order>();
	
	
	public void takeOrders(Order order){
		orders.add(order);
	}
	
	public void placeOrders(){
		for(Order order : orders){
			order.execute();
		}
		
		orders.clear(); // flushing out the orders once done
	}

}
