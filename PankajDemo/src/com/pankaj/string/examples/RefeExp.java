package com.pankaj.string.examples;

public class RefeExp {

	public static void main(String[] args) {
		String s ="Pankaj";
		String s1 = new String("Pankaj");
		String s2 = "Pankaj";
		System.out.println((s==s1));
		System.out.println((s==s2));
		String s3 = new String("Pankaj");
		System.out.println(s3==s1);
	}

}
