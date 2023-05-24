package com.pankaj.string.examples;

public class RemoveBandAC {
	private static String str = "acbrambabasc";

	public static void main(String[] args) {
		 String s1 = removeBandACstr(str);
		 System.out.println(s1);
		
	}
	private static String removeBandACstr(String str)
	{
		char[] ch = str.toCharArray();
		String newStr="";
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]!='b')
			{
				newStr += ch[i];
			}
		}
		return newStr;
	}
}
