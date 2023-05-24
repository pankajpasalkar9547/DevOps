package com.Java.Basic;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,mul;
		System.out.println("Enter the No. for Table :");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		for (int i=1;i<=10;i++)
		{
			mul = a*i;
			System.out.println(a+" * "+i+" = "+mul);
			System.out.println("\n");
		}

	}

}
