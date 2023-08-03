package algoPrj.day3;

import java.util.Scanner;

public class 반복문 {

	public static void main(String[] args) {

		//
		System.out.println("안녕하세요");
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("안녕하세요");
		}
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int su=sc.nextInt();
			if(su==0) break;
			System.out.println(su + "계속..");
			
			
		}
		System.out.println("for bye");
		
		while(true) {
			int su = sc.nextInt();
			if(su==100) break;
			System.out.println(su + "계속..");
		}
		System.out.println("while bye");

	}

}
