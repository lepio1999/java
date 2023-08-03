package algoPrj.day3;

public class 윤P_1 {

	public static void main(String[] args) {

		// 항의 순번 1   2   3   4   5   6
		// 항      1 + 3 + 5 + 7 + 9 + 11 ....99합을 구하시오
		
		int sum = 0;
		int n=1;
		
		while(n <= 99) {
			sum += n;
			n+=2; // n=n+2;
			
		}
		System.out.println(sum);
	}

}
