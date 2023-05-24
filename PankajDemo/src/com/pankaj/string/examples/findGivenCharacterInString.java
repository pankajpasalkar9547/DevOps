package com.pankaj.string.examples;

import java.util.Scanner;

public class findGivenCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Pankaj";
		System.out.println("Enter the char : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0); 
		System.out.println(ch);
		
		for(int i=0;i<s.length();i++)
		{
			char p = s.charAt(i);
			if(ch == p)
			{
				System.out.println(i);
				break;
			}
			else
			{
				System.out.println("Not Found");
			}
		}
		

	}

}
