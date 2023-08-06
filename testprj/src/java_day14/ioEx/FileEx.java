package java_day14.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("res/test.txt");
			int datal = fis.read();
			System.out.println((char)datal);


		
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
