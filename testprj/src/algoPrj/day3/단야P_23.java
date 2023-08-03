package algoPrj.day3;

public class 단야P_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0; //누적합
		
		//처리
		int jsum = 0;
		
		int i =1; //반복을 제어할 변수
		int j=i-1; //j=0
		
		final int MAX = 5;
		
		// i = 1 2     3      4 5 6 7 8 9 ...100
		// j = 0 1     2      3 4 5 6 7 8 ...99
		//     1 (1+2) (1+2+3)
		while (i<=MAX) {
			j = i-1;
			jsum  = jsum +j;
			sum = sum +(jsum+i);
			i++;
		}
		System.out.println(sum);
	}

}
