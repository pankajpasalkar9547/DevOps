package com.pankaj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExp {

	public static void main(String[] args) {
		try
		
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println("Befor deletion : "+l);
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println("Printing Values : "+itr.next());
			
			Integer i = (Integer) itr.next();
			if(i == 2)
			{
				itr.remove();
			}
		}
		
		System.out.println("After removing : "+l);

	}

}
