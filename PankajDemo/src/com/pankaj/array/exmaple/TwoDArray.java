package com.pankaj.array.exmaple;

import java.util.Scanner;

public class TwoDArray {
	
	static int a[][];
	static int i,j,size;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Array row :");
		size = sc.nextInt();
		a = new int[size][size];
		
		initializeArray();
		
		displayArray();
		
	}
	
	private static void initializeArray() {
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.println("Enter the Element : ");
				a[i][j] =sc.nextInt();
			}
		}
	}

	private static void displayArray() {
		System.out.println("Array :");
		for(i = 0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
