package com.pankaj.string.examples;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i=(Integer) o1;
		Integer j=(Integer) o2;
		if(i==j)
		{
			return 0;
		}
		else if(i<j)
		{
			return 1;
		}
		else
			return -1;
		//return 0;
	}

}
