package com.pankaj.array.exmaple;

public class Ovrlodexp {
	
	public void sum(int a,float b)
	{
		System.out.println("First");
	}
	
	public void sum(float a, int b)
	{
		System.out.println("Second");
	}

	public static void main(String[] args) {
		Ovrlodexp e = new Ovrlodexp();
		e.sum(1, 1);
	}

}
