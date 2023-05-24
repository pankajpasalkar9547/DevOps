package com.pankaj.collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExp {
	private static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		list.add("red");
		list.add("black");
		System.out.println(list);
		list.add(0, "blue");
		System.out.println(list);

	}

}
