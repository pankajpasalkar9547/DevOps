package com.pankaj.string.examples;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//We can create an mutable string with StringBuilder

public class StringBuilderExp {
	
	static StringBuilder stringBuilder = new StringBuilder();

	public static void main(String[] args) {
		String str ="Pankaj";
		String str1 ="Pankaj";
		stringBuilder.append(str);
		System.out.println(stringBuilder);
		stringBuilder.append("Pasalkar");
		System.out.println(stringBuilder);
		//new StringBuilderExp().call();
		System.out.println(str == str1);

	}
	
	public void call()
	{
		
	}
}
