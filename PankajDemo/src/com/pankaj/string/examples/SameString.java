package com.pankaj.string.examples;

public class SameString {
	private static String s1 = "This is Pankaj Pasalkar";
	private static String s2 = "Pankaj is This Pasalkar";

	public static void main(String[] args) {
		
		if (s1.length() == s2.length()) {
			String s = checkString(s1, s2);
			System.out.println(s);
		} else
			System.out.println("Length is not equal");
	}

	private static String checkString(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int cnt = 0;
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch1[i] == ch2[j]) {
					cnt++;
					break;
				}

			}
		}
		if (cnt != s1.length()) {
			return "Not equal";
		} else
			return "Equal";
		// return "";
	}

}
