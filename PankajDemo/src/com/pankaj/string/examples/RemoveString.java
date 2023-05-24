package com.pankaj.string.examples;

public class RemoveString {
	private static String str ="Exercise Practice Solution";
	private static String rmStr ="Solution";

	public static void main(String[] args) {
		System.out.println("Before Remove : "+str);
		String afterRm = removeWord(str, rmStr);
		System.out.println("After Removing : "+afterRm);
	}
	private static String removeWord(String str, String rmStr)
	{
		if(str.contains(rmStr))
		{
			str = str.replaceAll(rmStr,"");
			
		}
		return str;
	}
}
