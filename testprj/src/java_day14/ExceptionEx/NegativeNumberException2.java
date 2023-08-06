package java_day14.ExceptionEx;

// Exception(선택예외)
public class NegativeNumberException2 extends Exception {
	

	public NegativeNumberException2() {
		//
		super( "100보다 작게 입력하세요");
	}

}
