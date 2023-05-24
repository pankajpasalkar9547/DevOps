package com.pankaj.array.exmaple;

import java.util.Scanner;

public class MergeTwoArrays {
	
	static int arr1[],arr2[],arr3[] = {};
	static int size;
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Size Of A :");
		size  = sc.nextInt();
		arr1 = new int [size];
		System.out.println("Enter The Size Of B :");
		size  = sc.nextInt();
		arr2 = new int [size];

		// Adding Element in A
		for(int i = 0;i<arr1.length;i++)
		{
			System.out.println("Enter Element in A ");
			arr1[i] = sc.nextInt();
		}
		// Adding Element in B
		for(int i = 0;i<arr2.length;i++)
		{
			System.out.println("Enter Element in B ");
			arr2[i] = sc.nextInt();
		}
		
		//Printing Element of A and B
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("A array");
			System.out.println(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("B Array");
			System.out.println(arr2[i]);
		}
		
		//Merging of Array
		int max = arr1.length + arr2.length;
		int cnt=0;
		System.out.println("Max size of merging array : "+max);
		arr3 = new int[max];
		for(int i = 0;i<arr1.length;i++)
		{
			arr3[cnt] = arr1[i];
			cnt++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[cnt] = arr2[i];
			cnt++;
		}
		
		//Printing 3rd Array

		System.out.println("After Merge : ");
		for(int i = 0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}

	}

}
