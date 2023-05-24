package com.pankaj.string.examples;

import java.util.Scanner;

public class CountCharacterInString {

	static String s;
	static char ch;
	static int cnt= 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String : ");
		s = sc.nextLine();
		System.out.println("Enter the character : ");
		ch = sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(ch == s.charAt(i))
			{
				cnt++;
			}
		}
		System.out.println(ch+" is "+cnt+" times");
		
	}

}
