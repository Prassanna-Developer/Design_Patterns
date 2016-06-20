package com.learn.structural.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements ICriteria{
	
	List<Person> filterCriteria = null;
	
	ICriteria first = null;
	ICriteria second = null;

	public AndCriteria(ICriteria firstCriteria,ICriteria secondCriteria){
		filterCriteria = new ArrayList<Person>();
		
		first = firstCriteria;
		second = secondCriteria;
	}

	public List<Person> meetCreiteria(List<Person> list) {
		List<Person> firstFilterList = first.meetCreiteria(list);
		
		return second.meetCreiteria(firstFilterList);
	}
	
	
	
	
}
