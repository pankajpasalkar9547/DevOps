package com.pankaj.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DogSeriExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		String s = "D:/Hibernate/DogExp.txt";
		
		  FileOutputStream fos = new FileOutputStream(s); 
		  ObjectOutputStream oos = new ObjectOutputStream(fos); 
		  oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream(s);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object d1 = (Dog)ois.readObject();
		System.out.println(d1);

	}

}
