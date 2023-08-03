package java_day9_실습;

import java.util.Scanner;

public class Java_2_like {

	public static void main(String[] args) {
		
		String[] likes = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		int index=0;
		
		like1(likes, sc, index);

	}

	private static void like1(String[] likes, Scanner sc, int index) {
		int menu;
		loop : while(true) {
			System.out.println("메뉴: 1.등록 2.조회");
			
			String menu_ = sc.nextLine();
			menu = Integer.parseInt(menu_);
			//"25" -> 25 (변환기능)
			// Integer: 정수로 변환시켜주는 매서드
			
			switch(menu) {
			case 1:
				System.out.println("좋아하는것을 입력하세요.");
				String like = sc.nextLine(); 
				likes[index]=like;
				index++;
				break;
			
			case 2:
				System.out.println("좋아하는것을 조회합니다.");
				for(int i=0; i<index; i++) {
					System.out.println(likes[i]);
				}
			}
			
		}
	}

}
