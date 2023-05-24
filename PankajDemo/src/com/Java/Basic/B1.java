package com.Java.Basic;

public class B1 extends A1{
	public void drive()
	{
		System.out.println("B1");
	}
	public static void main(String args[])
	{
		A1 a = new B1();
		a.drive();
	}

}
