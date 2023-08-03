package java_day12_quiz2;

public class CalculatorJH implements Calculator {

	@Override
	public String name(String name1) {
		System.out.println("JH name");
		return name1;
	}

	@Override
	public int score(int num1) {
		System.out.println("JH num");
		return num1;
	}

}
