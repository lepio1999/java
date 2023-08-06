package java_day14.ExceptionEx;

public class MyMath3 {
										 //예외던지기, 예외미루기
	public int add2( int num1 , int num2) throws NegativeNumberException {		
		
		
		if(num1 <0 || num2<0) {
			//예외발생 시키기
			//예외발생시키는 키워드 throw
			throw new NegativeNumberException();
		}
		return num1+  num2;
	}
	
}
