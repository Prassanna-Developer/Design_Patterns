package com.learn.structural.compositepattern;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee ceo = new Employee("Bhagavathy", "Female");
		Employee hrManager = new Employee("Jayashree", "Female");
		Employee projectManager = new Employee("Prassanna", "Male");

		Employee client1 = new Employee("Kiruba", "Female");
		Employee client2 = new Employee("Krisha", "Female");
		
		
		ceo.addSubOrdinates(hrManager);
		ceo.addSubOrdinates(projectManager);

		hrManager.addSubOrdinates(client1);
		hrManager.addSubOrdinates(client2);
		
		projectManager.addSubOrdinates(client1);
		projectManager.addSubOrdinates(client2);
		
		System.out.print(ceo.getName() + " [");
		for(Employee headEmployee : ceo.getSubordinates() ){
			System.out.print(headEmployee + " [");
			for(Employee subEMp : headEmployee.getSubordinates()){
				System.out.print(subEMp + " ");
			}
			System.out.print(" ]");
		}
		System.out.print(" ]");

	}

}
