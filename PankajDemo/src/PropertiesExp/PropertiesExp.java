package PropertiesExp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExp {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("D:\\PropFile.txt");
			prop.load(fis);
			System.out.println(prop.getProperty("kafkaTopic"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
