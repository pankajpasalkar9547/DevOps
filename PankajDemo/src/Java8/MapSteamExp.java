package Java8;

import java.util.Map;
import java.util.TreeMap;

public class MapSteamExp {

	public static void main(String[] args) {
		
		Map<Integer,String> orgMap = new TreeMap<>();
		orgMap.put(1, "Pankaj");
		orgMap.put(20, "Dhiraj");
		orgMap.put(0, "Dhiraj");
		
		System.out.println(orgMap);
		

	}

}
