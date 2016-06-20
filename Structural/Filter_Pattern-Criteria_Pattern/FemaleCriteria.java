package com.learn.structural.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements ICriteria{
	
	List<Person> filteredList = null;

	public FemaleCriteria() {
		filteredList = new ArrayList<Person>();
	}

	public List<Person> meetCreiteria(List<Person> list) {
		
		for(Person person : list){
			if(person.getGender().equals(Constants.FEMALE)){
				filteredList.add(person);
			}
		}
		
		return filteredList;
		
	}

}
