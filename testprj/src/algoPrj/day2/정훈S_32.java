package algoPrj.day2;

public class 정훈S_32 {

	public static void main(String[] args) {
		
		long a, b;
		a=b=1;
		int n=2;
		final int MAX =50;
		
		System.out.println(a+" "+b);
		while(true) {
			a = a+b;
			n = n+1;
			System.out.println(a);
			if(n>=MAX) break;
			
			b=a+b;
			n=n+1;
			System.out.println(b);
			if(n>=MAX)break;
		}

	}

}
