package java_day9함수;

public class CallByReference2 {

	public static void main(String[] args) {
		
		//
		int[] kors = new int[3];
		
		input(kors);
		
	
		
		//조회
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);


	}
	
	public static void input(int[] c) {// c변수 : 참조형변수 
		//등록
		c[0]=5;
		c[1]=8;
		c[2]=9;
		
	}
	

}
