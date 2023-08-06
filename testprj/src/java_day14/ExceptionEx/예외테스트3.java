package java_day14.ExceptionEx;


public class 예외테스트3 {

	public static void main(String[] args) {
		
	MyMath m = new MyMath();
	
	try {
		m.add2(-5, 3);
	} catch (NegativeNumberException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
		
		

	}

}
