package java_day14.ExceptionEx;

public class MyMath2 {
										 //예외던지기, 예외미루기
	public int JH( int num ) throws NegativeNumberException {		
		
		
		if(num >=100 ) {
			//예외발생 시키기
			//예외발생시키는 키워드 throw
			throw new NegativeNumberException();
		}
		return num;
	}
	
}
