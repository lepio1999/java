package 허재혁실기평가;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			int sum = dan*i;
			
			System.out.println(dan+"X"+i+"="+sum);
		}
		
		
		
		

	}

}
