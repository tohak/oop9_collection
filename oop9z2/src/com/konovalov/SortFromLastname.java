package com.konovalov;

import java.util.Comparator;

public class SortFromLastname implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getLastname().compareTo(o2.getLastname())>0) {
			return +1;
		} else if(o1.getLastname().compareTo(o2.getLastname())<0){
			return -1;
		}
		return 0;
	}

}
