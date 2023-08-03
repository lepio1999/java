package algoPrj.day1;

public class 증가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double H = 2500000;
		double K = 1800000;
		int year = 1999;
		double a=0;
		double b=0;

		
		while(H>K) {
			
			


			
			a = H *0.036;
			
			b = K * 0.042;
			
			H = H + a;
			K = K+ b;
			year = year +1;


			
		}

		
		System.out.println(year);


	}

}
