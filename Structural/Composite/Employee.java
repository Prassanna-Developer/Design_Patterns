package com.learn.structural.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	
	private String name;
	private String gender;
	
	private List<Employee> subordinates;

	public Employee(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		subordinates = new ArrayList<Employee>();
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void addSubOrdinates(Employee emp) {
		this.subordinates.add(emp);
	}
	
	public String toString(){ 
		return name;
	}

	public String getName() {
		return name;
	}
	
	

}
