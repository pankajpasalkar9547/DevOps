package com.pankaj.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEmptyCheck {
	private static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		list.add("pankaj");
		boolean al = checkStringEmpty(list);
		System.out.println(al);
	}
	private static boolean checkStringEmpty(List<String> list)
	{
		if(list.isEmpty())
		{
			return true;
		}
		else
			return false;
		
	}

}
