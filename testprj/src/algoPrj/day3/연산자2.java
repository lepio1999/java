package algoPrj.day3;

public class 연산자2 {

	public static void main(String[] args) {

		//a++ , ++a , a-- , --a
		
		int a = 10;
		int b = 10;
		
		int resulta;
		int resultb;
		
		resulta = a++;
		resultb = ++b;
		
		a++;
		++b;
		

		
		int c = 10;
		int d = 10;
		
		int resultc;
		int resultd;
		
		resultc = c--;
		resultd = --c;
		
		
		c--;
		--d;
		
		System.out.println(a); //11
		System.out.println(b); //11
		
		System.out.println(resulta); //10
		System.out.println(resultb); //11
		
		System.out.println(c);//9
		System.out.println(d);//9
		
		
		System.out.println(resultc);//10
		System.out.println(resultd);//9
		
		//문제
		//int result = a++ + --b + c++ - d--;
		// 11 + 10+ 9 - 9 = 21
		
		//result ?

	}

}
