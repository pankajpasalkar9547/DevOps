package com.pankaj.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SOrtArrayList {
	private static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(44);
		list.add(5);
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println("After Sorting : "+list);
		//System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		int temp=0;
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				int a = list.get(i);
				int b = list.get(j);
				if(a<b)
				{
					temp=a;
					list.set(i, b);
					list.set(j, temp);
				}
			}
		}
		System.out.println("List For Loop : "+list);

	}

}
