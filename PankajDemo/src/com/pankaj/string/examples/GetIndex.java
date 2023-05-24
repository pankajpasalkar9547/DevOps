package com.pankaj.string.examples;

import java.util.Scanner;

public class GetIndex {

	//private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int value=2;
		String s = "Pankaj Pasalkar";
		System.out.println("Enter index value "+ value);
		for(int i=0;i<s.length();i++)
		{
			if(i==value)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}
