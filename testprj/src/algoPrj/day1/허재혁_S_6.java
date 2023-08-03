package algoPrj.day1;

public class 허재혁_S_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum=0;
		int multi=1;
		int i =1;
		
		final int MAX=10;
		int a = -1;
		double an;
		
		sum += multi;
		
		while(i<MAX) {
			i=i+1;
			an = (a*(i/(double)multi));
			multi = i*multi;
			sum = sum + an;
			System.out.println(sum);
			a=-a;
			
		}
		System.out.println(sum);
		double result  = 3 / 6.0;
		System.out.println("result="+result);

	}

}
