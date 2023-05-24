package com.pankaj.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveThirdEle {
	private static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);

	}

}
