package java_day12_인터페이스;
	//인터페이스 상속
	// 인터페이스(약속)을 구현한다는 의미를 가짐
	// implements 키워드를 사용함
	public class MyCalculatorJH implements CalculatorI{
		
		@Override
		public int add(int su1, int su2) {
			System.out.println("JH add");
			return su1+su2;
		}
		@Override
		public int divide(int su1, int su2) {
			System.out.println("JH divide ");
			return su1/su2;
		}@Override
		public int sub(int su1, int su2) {
			System.out.println("JH sub ");
			return su1-su2;
		}
		@Override
		public int multi(int su1, int su2) {
			System.out.println("JH multi ");
			return su1*su2;
		}
		
	}

 
