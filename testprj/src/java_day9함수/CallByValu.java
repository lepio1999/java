package java_day9함수;

public class CallByValu {

	public static void main(String[] args) {
		int a = 5, b = 10;
		int result = adder(a, b);

		int c = 9; // main에서 만든 c라는 변수
		int result2 = input(c); // input함수에서 c의 변화 시ㅣㄹ 수 있는가?
					// 변화시키고 싶다면 ...
		c = result2;
		

	}

	public static int adder(int su1, int su2) {
		return su1 + su2;
	}

	public static int input(int su) {
		return 5;
	}

}
