package com.learn.structural.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements ICriteria{
	
	List<Person> filteredList = null;

	public SingleCriteria() {
		filteredList = new ArrayList<Person>();
	}

	public List<Person> meetCreiteria(List<Person> list) {
		
		for(Person person : list){
			if(person.getMarritalStatus().equals(Constants.SINGLE)){
				filteredList.add(person);
			}
		}
		
		return filteredList;
		
	}

}
