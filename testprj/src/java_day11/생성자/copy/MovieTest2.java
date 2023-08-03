package java_day11.생성자.copy;

public class MovieTest2 {

	public static void main(String[] args) {
		//생성자는 함수, 매서드동일, 특별한 매서드
		//이름이 없는 매서드입니다.
		//단 한번 new객체를 생성할 때 객체의 ㅊ기화를 담당하는 역활을 가진다.
		MovieClass M = new MovieClass("분노의 질주: 라이드 오어 다이", "action", "2시간 21분", "15세이상");
		M.printInfo();
		
		MovieClass M2 = new MovieClass("쥬라기 월드: 도미니언", "action/SF", "2시간 27분", "12세 이상");
		M2.printInfo();
		
		MovieClass M3 = new MovieClass("서치 2", "thriller", "1시간 51분", "12세 이상");
		M3.printInfo();
		
		
		
		
		
	}

}
