package 허재혁실기평가;

import java.util.Scanner;

public class Quiz2_MyClass {

	public static void main(String[] args) {
		
		int getTotal=0;
		
		getTotal = getTotal(getTotal);
		System.out.println(getTotal);
		
	}

	private static int getTotal(int getTotal) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		int su = sc.nextInt();
		
		for(int i=1; i<=su; i++) {
			getTotal += i;
			
		}
		return getTotal;
	}

}
