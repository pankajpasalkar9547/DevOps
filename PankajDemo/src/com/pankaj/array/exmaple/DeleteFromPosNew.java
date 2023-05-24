package com.pankaj.array.exmaple;

import java.util.Scanner;

public class DeleteFromPosNew {

	public static void main(String[] args) {
		int a[] = new int[5];
		int pos = 0,value = 5;
		System.out.println(a.length);
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=pos ;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		System.out.println("*********************************");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
