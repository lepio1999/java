package java_day7;

public class 홀짝 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		
		for(int i=1; i<=10; i++) {
			//System.out.println(i);
			if(i%2==0) {
				a=i;
				System.out.println("짝수"+a);
			}else {
				b=i;
				System.out.println("홀수"+b);
			}
		}

	}

}
