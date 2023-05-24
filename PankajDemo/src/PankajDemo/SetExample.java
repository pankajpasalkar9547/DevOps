package PankajDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s= new TreeSet<String>();
		
		s.add("Pankaj");
		s.add("Pasalkar");
		s.add("Pankaj");
		//s.add(null);
		//s.add(null);
		s.add("Neeta");
		
		 //System.out.println(s);
		s.forEach((i)->System.out.println(i));
		

	}

}
