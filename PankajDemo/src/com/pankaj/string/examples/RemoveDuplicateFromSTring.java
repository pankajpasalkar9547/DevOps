package com.pankaj.string.examples;

public class RemoveDuplicateFromSTring {
	private static String str = "the quick brown fox";
	private static String strRm = "queen";

	public static void main(String[] args) {
		String str1 = remove(str, strRm);
		System.out.println(str1);

	}

	private static String remove(String str, String rmstr) {
		String[] s = str.split(" ");
		char[] ch = rmstr.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < s.length; j++) {
				String s1 = s[j];
				if (s1.contains(""+ ch[i])) {
					str = str.replace("" + ch[i], "");
				}
			}
		}
		return str;
	}
}
