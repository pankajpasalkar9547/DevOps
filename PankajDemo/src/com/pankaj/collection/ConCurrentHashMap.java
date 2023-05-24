package com.pankaj.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConCurrentHashMap {

	public static void main(String[] args) {
		ConcurrentMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		m.put(1, "Pankaj");
		m.put(2, "Pa");
		m.put(3, "Pkaj");
		m.put(4, "Pnkaj");
		m.put(5, "Panj");
		
		for(Map.Entry<Integer, String> e : m.entrySet())
		{
			System.out.println(e.getKey() +" "+e.getValue());
		}
		
		Set s  = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			if(itr.next().equals("Pankaj"))
			{itr.remove();}
		}
		
	}

}
