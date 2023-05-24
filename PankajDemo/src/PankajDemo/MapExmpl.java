package PankajDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MapExmpl {

	public static void main(String[] args) {
		Map<Integer,String> mapExample = new HashMap<>(10);
		mapExample.put(1,"Pankaj");
		mapExample.put(2,"Dhiraj");
		mapExample.put(4,"Pankaj");
		
		Set s = mapExample.entrySet();
		Iterator itr = s.iterator();
		if(itr.hasNext())
		{
//			Map.Entry e = (Entry) itr.next();
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
			System.out.println(itr.next());
		}

	}

}
