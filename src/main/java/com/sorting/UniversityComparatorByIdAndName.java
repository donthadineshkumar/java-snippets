package com.sorting;

import java.util.Comparator;

public class UniversityComparatorByIdAndName implements Comparator<University>{

	@Override
	public int compare(University o1, University o2) {
		int flag = o1.getId() -o2.getId();
		if(flag == 0) flag = o1.getName().compareTo( o2.getName() );
		return flag;
	}
	
}
