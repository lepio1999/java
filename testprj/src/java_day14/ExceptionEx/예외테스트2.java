package java_day14.ExceptionEx;

import java.util.Scanner;

public class 예외테스트2 {

	public static void main(String[] args) {
		
		MyMath2 m = new MyMath2();
		
		while(true) {
			
		int su;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		su = sc.nextInt();
		
		if(su == 0) {
			System.out.println("종료합니다.");
			break;
		}
		
		try {
			int result = m.JH(su);
			System.out.println(result);
			
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("100보다 작게 입력하세요");
		}
		}
		
		
		

	}

}
