package com.pankaj.serialization;

import java.io.Serializable;

public class Dog implements Serializable {
	public int a=10;

	@Override
	public String toString() {
		return "a=" + a + "";
	}
	
	
}
