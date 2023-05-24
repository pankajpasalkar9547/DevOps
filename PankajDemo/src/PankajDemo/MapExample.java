package PankajDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Map<Integer,String> m1 = new LinkedHashMap<>();
		m1.put(1, null);
		m1.put(null,null);
		m1.put(2, "Pankaj");
		m1.put(3, "Pankaj");
		m1.put(5, "Pasalkar");
		m1.put(4, "Pasalkar");
		Set s = m1.entrySet();
		System.out.println(s);
		
	}

}
