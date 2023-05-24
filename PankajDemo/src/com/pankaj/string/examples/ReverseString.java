package com.pankaj.string.examples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr The String : ");
		s =sc.nextLine();
		System.out.println("Original String : "+s);
		
		String r ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r = r+s.charAt(i);
		}
		System.out.println("Rev String : "+r);
	}

}
