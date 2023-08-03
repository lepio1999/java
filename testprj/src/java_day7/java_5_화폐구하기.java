package java_day7;

import java.util.Scanner;

public class java_5_화폐구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		extracted();
		
		
	
	}

	private static void extracted() {
		int [] moneyArr = {50000, 10000, 5000, 1000, 100, 50, 10};
		int [] moneyArrLength = new int [moneyArr.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력해주세요");
		int money = sc.nextInt();
		
		for(int i = 0; i<moneyArr.length; i++) {
			moneyArrLength[i] = money / moneyArr[i];
			money %= moneyArr[i];
		}
		
		System.out.println("돈 매수 수하기");
		for(int i=0; i<moneyArrLength.length; i++) {
			System.out.println(moneyArrLength[i]+ " ");
		}
	}

}