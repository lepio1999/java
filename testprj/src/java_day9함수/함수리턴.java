package java_day9함수;

public class 함수리턴 {

	public static void main(String[] args) { // 시작
		
		int[] arr = new int [] {9,8,7};
		printArry(arr); // 호출되면 코드를 수행하고 호출한 쪽으로 돌아옴

	} //종료
	
	public static void printArry(int[] a) {
		
		for(int number : a) {
			System.out.println(number);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	} //함수의 종료
	
	

}
