package 듀오;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("햄버거 이름을 입력");
		String 버거이름 = sc.nextLine();
		System.out.println("들어가는 소스");
		String 소스 = sc.nextLine();
		System.out.println("빵의 종류");
		String 빵 = sc.nextLine();
		System.out.println("패티의 종류");
		String 패티 = sc.nextLine();
		System.out.println("야채의 종류");
		String 야채 = sc.nextLine();
		

		
		MyBugerJH buger = new MyBugerJH(버거이름,소스,빵,패티,야채);
		System.out.println(buger);
		
		
	}

}
