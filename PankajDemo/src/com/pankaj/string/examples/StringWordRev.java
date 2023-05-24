package com.pankaj.string.examples;

public class StringWordRev {
	
	StringWordRev()
	{
		
	}

	public static void main(String[] args) {
		String s = "Pankaj Pasalkar";
		String s1[] = s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			String s2 = s1[i];
			char c[] = s2.toCharArray();
			for(int j =c.length-1;j>=0;j--)
			{
				System.out.print(c[j]);
			}
		}
	}

}
