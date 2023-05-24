package com.Java.exception;

import java.io.IOException;

public class OverridingException {
	
	public void m1()
	{
	
	}
}

class OverExp extends OverridingException
{
	public void m1() throws IOException
	{
		
	}
}
