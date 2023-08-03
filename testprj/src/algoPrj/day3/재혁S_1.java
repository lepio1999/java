package algoPrj.day3;

public class 재혁S_1 {

	public static void main(String[] args) {
		
		int year = 1999;
		double h =  2500000;
		double k = 1800000;
		double a; //h의 증가분
		double b; //k의 증가분
		
		while(h > k) {
			year++;
			a = h*0.036;
			b = k*0.042;
			//각 인구 수 갱신
			h = h + a;
			k = k + b;
		}
		System.out.println(year);

	}

}
