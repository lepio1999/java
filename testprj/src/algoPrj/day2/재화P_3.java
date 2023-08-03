package algoPrj.day2;

import java.util.Scanner;

public class 재화P_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력변수
		int num;

		
		//출력변수
		int pos =0;
		int neg =0;
		int posEvent = 0;
		int posOdd = 0;
		
		//처리변수
		int count =0;
		final int MAX =10;
		
		Scanner sc = new Scanner (System.in);
		
		while(count < 10) {
			count ++;
			num = sc.nextInt();
			
			if(num >0) {
				pos = pos+1;
				if(num %2 ==0) {
					posEvent++;
				}else {
					posOdd++;
				}
			}else {
				neg++;
			}
		}
		
		//출력
		System.out.println("양수의 개수" +pos);
		System.out.println("음수의 개수" +neg);
		System.out.println("양수중 짝수의 개수" +posEvent);
		System.out.println("양수중 홀수의 개수" +posOdd);
		

	}

}
