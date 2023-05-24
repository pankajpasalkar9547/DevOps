package com.pankaj.array.exmaple;

import java.util.Scanner;

public class LargestNoInArray {

	static int arr[];
	static int size=0;
	static int max,min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Array Size : ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		arr = new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter The No. To add : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Given Array : "+arr[i]);
		}

		max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum = "+max);
	}

}
