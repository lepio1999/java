package java_day11_inheritance;

import java.util.Scanner;

public class 재열이의잔재 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("윤년구하기");
		int year = sc.nextInt();
		
		if ((year % 4 )== 0 && (year%100) != 0 || (year %400) ==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	 
	}

}
