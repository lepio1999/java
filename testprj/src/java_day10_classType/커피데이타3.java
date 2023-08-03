package java_day10_classType;

public class 커피데이타3 {

	private int 설탕;
	private int 프리마;
	private int 원두;
	private int 물;
	private int 매출금액;

	//입력기능
	public void input(int 설탕, int 프리마, int 원두, int 물) {
		//클래스 멤버변수
		this.설탕 = 설탕;
		this.프리마 = 프리마;
		this.원두 = 원두;
		this.물 = 물;

	}
	// 출력기능
	
	public void printInfo() {
		System.out.println(물);
		System.out.println(설탕);
		System.out.println(프리마);
		System.out.println(원두);
		System.out.println(매출금액);
	}
}
