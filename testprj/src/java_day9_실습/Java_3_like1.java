package java_day9_실습;

import java.util.Scanner;

public class Java_3_like1 {

	public static void main(String[] args) {
		
		String[] likes = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		int index=0;
		
		loop : while(true) {
			System.out.println("메뉴: 1.등록 2.조회 3.변경");
			
			String menu_ = sc.nextLine();
			menu = Integer.parseInt(menu_);
			//"25" -> 25 (변환기능)
			// Integer: 정수로 변환시켜주는 매서드
			
			switch(menu) {
			case 1:
				System.out.println("좋아하는것을 입력하세요.");
				String likes_ = sc.nextLine(); 
				likes[index]=likes_;
				index++;
				break;
			
			case 2:
				System.out.println("좋아하는것을 조회합니다.");
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+"."+likes[i]);
				}
				break;
			
			case 3:
				System.out.println("변경");
				
				System.out.println("일정을 조회합니다");
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+"."+likes[i]);
				}
				
				System.out.println("변경할 번호를 입력하세요.");

				String updateIndex_ = sc.nextLine() ;
				int updateIndex = Integer.parseInt(updateIndex_);
				
				System.out.println("변경할 내용을 입력하세요.");
				String updateLikes_ = sc.nextLine();
				likes[updateIndex-1] = updateLikes_;
				
				break;
				
			}
			
		}

	}

}
