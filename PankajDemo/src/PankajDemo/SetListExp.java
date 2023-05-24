package PankajDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new CopyOnWriteArrayList<>();
		al.add("Pankaj");
		al.add("Pasalkar");
		al.add("DHH");
		al.add("9");
		al.add("10");
		al.add("11");
		al.add("14");
		//Set<String> s = new TreeSet<>(al);
		//System.out.println(s);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("10"))
			{
				al.remove(0);
			}
		}
		System.out.println(al);

	}

}
