package java_day12_quiz2;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new CalculatorJH();
		String result=cal.name("허재혁");
		System.out.println(result);
		
		int result2 = cal.score(70);
		System.out.println(result2);

	}

}
