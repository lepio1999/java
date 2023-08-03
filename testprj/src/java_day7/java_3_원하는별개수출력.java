package java_day7;

import java.util.Scanner;

public class java_3_원하는별개수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extracted();


	}

	private static void extracted() {
		int num;
		System.out.print("원하는 별의 개수를 입력하세요:");
		Scanner sc = new Scanner(System.in);	
		num = sc.nextInt();
		
		for(int i=0; i<num; i++ ) {
			System.out.print("*");
		}
	}

}
