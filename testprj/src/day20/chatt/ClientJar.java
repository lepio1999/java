package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientJar {

	Socket s;

	DataInputStream dis;
	DataOutputStream dos;

	public ClientJar() {
		// 서버의 ip port
		try {
			s = new Socket("192.168.0.26", 6100);

			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			// 보내기
			dataSend();
			// 받기
			dataRecv();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 읽기
	private void dataRecv() {

		/*
		 * while(true) { String message; try { message = dis.readUTF();
		 * System.out.println(message); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 * 
		 * }
		 */
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					String message;
					try {
						message = dis.readUTF();
						System.out.println(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		});
		t.start();
	}

	// 쓰기
	private void dataSend() {
		Scanner sc = new Scanner(System.in);

		/*
		 * while (true) { System.out.println("메세지: "); String message = sc.nextLine();
		 * try { dos.writeUTF(message); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 * 
		 * }
		 */

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println("메세지: ");
					String message = sc.nextLine();
					try {
						dos.writeUTF(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		});
		t.start();
	}

	public static void main(String[] args) {
		ClientJar c = new ClientJar();
		
	}

}
