package com.Java.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			if(i==2||i==4||i==5||i==7||i==8||i==0||i==1)
			{
			}
			else if(i==6||i==9)
			{
				cnt++;
			}
			else if((i%10)==6||(i%10)==9||(i/10)==0)
			{
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}
