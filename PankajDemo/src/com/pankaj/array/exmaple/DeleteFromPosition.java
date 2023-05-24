package com.pankaj.array.exmaple;
import java.util.*;

public class DeleteFromPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int pos = 2,value = 5;
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
		for(int i = a.length-1;i>pos;i--)    
		{
			a[i]=a[i-1];
		  //4 = 0;
		}
		a[pos]=value;
		System.out.println("*********************************");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
