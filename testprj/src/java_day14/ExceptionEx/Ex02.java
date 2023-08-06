package java_day14.ExceptionEx;

public class Ex02 {

	public static void main(String[] args) {
		// 예외처러: 예외발생시 대비코드를 작성하는 것
		
		//필수: checked : 반드시 해야하는 것 !!
		//선택: unchecked //배열범위벗어 났을 떄, 0으로 나누는것, "25안" -> 
		// => 방법1개 try{} catch() 이용
		
		try {
			//예외가 발생하면 예외객체가 생성됨
		int[] arr = new int[3];
		arr[3] = 50;
		//예외가 발생하면 예외 객체가 생성됨
		System.out.println(arr[3]);
		}catch(Exception e){
			//catch(ArrayIndexOutOfBoundsException e)
			//예외가 발생 되었을 때 해야할 일(코드)
		}
		System.out.println("정상종료");

	}

}
