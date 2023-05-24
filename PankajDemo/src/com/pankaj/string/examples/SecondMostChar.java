package com.pankaj.string.examples;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SecondMostChar {
	private static String s1 = "successescsaaaa";
	static String firstKey = "";
	static Integer firstValue = 0;

	public static void main(String[] args) {
		char cnt = countSecond(s1);
	}

	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k1).compareTo(map.get(k2));
				if (compare == 0)
					return 1;
				else
					return compare;
			}
		};

		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

	private static char countSecond(String s) {
		Map<Character, Integer> m1 = new TreeMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int cnt = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					cnt++;
					m1.put(ch[i], cnt);
				}
			}
		}
		for (Entry<Character, Integer> ch1 : m1.entrySet()) {
			System.out.println(ch1.getKey() + " " + ch1.getValue());
		}

		Map<Character, Integer> m2 = sortByValues(m1);
		System.out.println(m2.entrySet());
		for(Map.Entry e : m2.entrySet())
		{
			System.out.println();
		}
		Object[] ch1 = m2.entrySet().toArray();
		for(int i=0;i<ch1.length;i++)
		{
			System.out.println("Ob "+ch1[i]);
		}
		
		System.out.println();
		System.out.println(m2);

		return 1;
	}

}
