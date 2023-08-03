package 허재혁실기평가;

import java.util.Scanner;

public class Quiz3_MyCalculator {

	public static void main(String[] args) {
		
		int su1;
		int su2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		su2 = sc.nextInt();
		
		munti(su1, su2);

	}

	private static void munti(int su1, int su2) {
		int sum;
		sum = su1*su2;
		System.out.println(su1+"X"+su2+"="+sum);
	}

}
