package PankajDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CollectionSort {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Pankaj");
		map.put(2, null);
		map.put(3, null);
		map.put(null, null);
		map.put(null, "Pankaj");
		
//		Set s = map.entrySet();
//		Iterator itr = s.iterator();
//		while (itr.hasNext())
//		{
//			Map.Entry e = (Entry)itr.next();
//			System.out.println(e.getKey()+" "+e.getValue());
//			
//		}
		
		Map<Integer,String> map1 = new TreeMap<Integer, String>(map);
		Set s1 = map1.entrySet();
		Iterator itr1 = s1.iterator();
		while (itr1.hasNext())
		{
			Map.Entry e1 = (Entry)itr1.next();
			System.out.println(e1.getKey()+" "+e1.getValue());
			
		}
	}

}
