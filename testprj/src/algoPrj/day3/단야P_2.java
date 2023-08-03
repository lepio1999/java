package algoPrj.day3;

public class 단야P_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0; //누적합
		
		//처리
		int jsum = 0;
		
		int i =1; //반복을 제어할 변수
		
		final int MAX = 100;
		
		// i = 1 2     3      4 5 6 7 8 9 ...100
		// j = 0 1     2      3 4 5 6 7 8 ...99
		//     1 (1+2) (1+2+3)
		while (i<=MAX) {
			jsum  = jsum +i;
			sum = sum +jsum;
			i++;
			System.out.println(sum);

		}
	}

}
