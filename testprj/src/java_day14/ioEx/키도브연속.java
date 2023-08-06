package java_day14.ioEx;

import java.io.IOException;

public class 키도브연속 {
	public static void main(String[] args) {
		
		while(true) {
			try {
				int data = System.in.read();
				System.out.println((char)data);
				
				if(data == '\n')break;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
