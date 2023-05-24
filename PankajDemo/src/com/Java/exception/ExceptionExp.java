package com.Java.exception;

public class ExceptionExp {

	public static void main(String[] args) {
		try
		{
			int i = 25/0;
			System.out.println(i);
		}
		catch(DevideByZero e)
		{
			System.out.println(e.getMessage());
			//throw new DevideByZero();
		}

	}

}
