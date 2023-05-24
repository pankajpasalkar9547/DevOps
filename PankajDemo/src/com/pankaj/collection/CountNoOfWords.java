package com.pankaj.collection;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfWords {
	private static String s1 = "I am live in Pune. This is my favorite city. I am"
			+ " ";
	private static Map<String, Integer> m1 = new HashMap<>();
	
	public static void main(String[] args) {
		String[] strArr = s1.split(" ");
		for(int i=0;i<strArr.length;i++)
		{
			int cnt=1;
			if(m1.containsKey(strArr[i]))
			{
				cnt++;
				m1.put(strArr[i], cnt);
			}
			else
				m1.put(strArr[i], cnt);
		}
		System.out.println(m1);
	}

}
