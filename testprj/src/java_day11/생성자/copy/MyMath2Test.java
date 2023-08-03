package java_day11.생성자.copy;

public class MyMath2Test {

	public static void main(String[] args) {
		
		//static 매서드방법 => new 필요하지 않음 클래스명.매서이름()
		int result2 = MyMath2.add(3, 5);
		double result = MyMath2.add(2.3, 3.5);
		
		System.out.println(result);
		System.out.println(result2);

	}

}
