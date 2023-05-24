package com.pankaj.static1.example;

public class StaticExample1 {
	
	static int a = 10;
	int b = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticExample1 t = new StaticExample1();
		System.out.println(a);
		System.out.println(t.b);
		t.b = 40;
		System.out.println(t.b);
		StaticExample1 t1 = new StaticExample1();
		System.out.println(a);
		System.out.println(t1.b);	


	}

}
