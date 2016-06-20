package com.learn.structural.filterpattern;

import java.util.List;

public class OrCriteria implements ICriteria {
	
	ICriteria firstCriteria = null;
	ICriteria secondCriteria = null;
	
	
	public OrCriteria(ICriteria firstCriteria, ICriteria secondCriteria) {
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}
	

	public List<Person> meetCreiteria(List<Person> list) {
		List<Person> firstList = firstCriteria.meetCreiteria(list);
		List<Person> secondList = secondCriteria.meetCreiteria(list);
		for(Person person : secondList){
			if(!firstList.contains(person)){
				firstList.add(person);
			}
		}
	 
		return firstList;
	}



}
