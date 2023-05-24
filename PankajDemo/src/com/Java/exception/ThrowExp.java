package com.Java.exception;

import java.io.IOException;

public class ThrowExp {

	public static void main(String[] args) throws IOException {

		int a = 10;
		//throw checked exception
		if (a == 10) {
			throw new IOException("Nukk");
		}
		//throw run time exception
		if (a == 10) {
			throw new NullPointerException();
		}
	}
}
