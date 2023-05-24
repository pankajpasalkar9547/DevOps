package com.pankaj.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapExp {

	public static void main(String[] args) {
		TreeMap<Integer,String> m = new TreeMap<>();
		m.put(1, "Pankaj");
		m.put(2, "Pasalkar");
		m.put(0, null);
		
		Set s =  m.entrySet();
		Iterator itr = s.iterator();
		System.out.println("Printing with Iterator");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("Printing with For Loop");
		
		for(Map.Entry e : m.entrySet())
		{
			System.out.println(e.getKey()+"----"+e.getValue());
		}
		
	}

}
