package com.learn.structural.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements ICriteria{
	
	List<Person> filteredList = null;

	public MaleCriteria() {
		filteredList = new ArrayList<Person>();
	}

	public List<Person> meetCreiteria(List<Person> list) {
		
		for(Person person : list){
			if(person.getGender().equals(Constants.MALE)){
				filteredList.add(person);
			}
		}
		
		return filteredList;
		
	}

}
