package com.learn.structural.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class MainCriteriaDemo {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		addToList(personList);
		
		ICriteria maleCriteria = new MaleCriteria();
		ICriteria femaleCriteria = new FemaleCriteria();
		ICriteria marriedCritera = new MarriedCriteria();
		ICriteria singleCriteria = new SingleCriteria();
		
		ICriteria singleFemaleCriteria = new AndCriteria(femaleCriteria, singleCriteria);
		ICriteria orCriteria = new OrCriteria(singleCriteria, marriedCritera);
		
		System.out.println("---Single FEMALE ---");
		printList(singleFemaleCriteria.meetCreiteria(personList));
		
		
		
		System.out.println("--- SINGLE OR MARRIED");
		printList(orCriteria.meetCreiteria(personList));
		
	}

	private static void addToList(List<Person> personList) {
		Person person1 = new Person(Constants.MARRIED, Constants.MALE, "Prasan");
		Person person2 = new Person(Constants.MARRIED, Constants.FEMALE, "Jay");
		
		Person person3 = new Person(Constants.SINGLE, Constants.FEMALE, "Kiruba");
		Person person4 = new Person(Constants.SINGLE, Constants.FEMALE, "Krisha");
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
	}
	
	public static void printList(List<Person> personList){
		for(Person person: personList){
			System.out.println(person);
		}
	}

}
