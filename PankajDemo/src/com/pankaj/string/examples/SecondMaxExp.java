package com.pankaj.string.examples;

public class SecondMaxExp {
	private static String str = "successesaaa";

	public static void main(String[] args) {
		char c = findSecondMax(str);
	}
	private static char findSecondMax(String str)
	{
		char[]ch = str.toCharArray();
		int max=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;i<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					max++;
				}
			}
			break;
		}
		return ' ';
	}
}
