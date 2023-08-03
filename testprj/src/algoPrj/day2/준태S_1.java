package algoPrj.day2;

public class 준태S_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y=1999;
		
		double hp = 250;
		double hu = 0.036;
		double hup = 0; 
		
		double kp = 180;
		double ku = 0.042;
		double kup = 0;
		
		int  c = 0;
		int sum ; 
		
		while(kp<=hp) {
				hup = hp * hu;
				hp = hp +hup;
				
				kup = kp * ku;
				kp = kp + kup;
				
				c = c+1;
				System.out.println("h시"+hp);
				System.out.println("k시"+kp);
			}

			sum = y +c;
			System.out.println(sum);
			


		
		

	}

}
