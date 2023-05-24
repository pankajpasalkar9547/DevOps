package com.pankaj.collection;

import java.util.TreeMap;

public class TreeMapWithoutGeneric {

	public static void main(String[] args) throws RuntimeException{
		TreeMap t = new TreeMap();
		t.put(1, "Pankaj");
		t.put(2, "Pasalkar");
		t.put(0, "xyz");
		t.put(5, null);
		//t.put("Pankaj", "xbxb");

		System.out.println(t);
	}

}
