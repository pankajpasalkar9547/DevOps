package com.Java.Basic;

public class StringRev {

	private static String str = "Pankaj";

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);

		System.out.println("*************************************");
		StringRev rev = new StringRev();
		String revStr = rev.revString(str);
		System.out.println(revStr);

	}

	public String revString(String str) {
		try {
			System.out.println("Reverse String without fuction");
			char ch[] = str.toCharArray();
			String revStr = "";
			for (int i = ch.length - 1; i >= 0; i--) {
				revStr += ch[i];
			}
			return revStr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
