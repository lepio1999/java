package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client0 {
	
	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	public Client0() {
	
		
		try {
			s= new Socket("localhost", 6100);
			System.out.println("서버에 요청 !!");
			
			
			//보내기
			dataSend();
			//받기
			dataRecv();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void dataRecv() {
		// TODO Auto-generated method stub
		
	}

	private void dataSend() {
		Scanner sc= new Scanner( System.in);
		System.out.println("메시지 작성:");
		String message = sc.nextLine();		
	}

	public static void main(String[] args) {
		Client0  c = new Client0();
		
	}
}
