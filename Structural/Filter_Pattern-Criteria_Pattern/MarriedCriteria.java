package com.learn.structural.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class MarriedCriteria implements ICriteria{
	
	List<Person> filteredList = null;

	public MarriedCriteria() {
		filteredList = new ArrayList<Person>();
	}

	public List<Person> meetCreiteria(List<Person> list) {
		
		for(Person person : list){
			if(person.getMarritalStatus().equals(Constants.MARRIED)){
				filteredList.add(person);
			}
		}
		
		return filteredList;
		
	}

}
