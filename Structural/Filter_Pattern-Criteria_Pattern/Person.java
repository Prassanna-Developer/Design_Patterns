package com.learn.structural.filterpattern;

public class Person {
	
	String marritalStatus;
	String gender;
	String name;
	
	public Person(String marritalStatus, String gender, String name) {
		this.marritalStatus = marritalStatus;
		this.gender = gender;
		this.name = name;
	}
	
	public String getMarritalStatus() {
		return marritalStatus;
	}
	public String getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	
	public String toString(){
		return "Name: " + name + ".. Married : " + marritalStatus + ".. Gender : " + gender;
	}
	
	

}
