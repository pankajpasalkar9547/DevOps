package com.pankaj.string.examples;

class RevByCHarArr
{
	public static void main(String args[])
	{
		String s = "Pankaj Pasalkar";
		char c[] = s.toCharArray();
		for(int i=c.length-1;i>0;i--)
		{
			System.out.println(c[i]);
		}

	}
}
