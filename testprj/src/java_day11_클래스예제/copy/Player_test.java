package java_day11_클래스예제.copy;

public class Player_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		player P;
		P = new player();
		P.volumeUp();
		P.volumeUp();
				
		//상위10곡 재생하기
		P.top10list();
				
		//랜덤곡 가져오기
		String randomMusic = P.랜덤재생하기();
		System.out.println( randomMusic);
		 
	
	}

}
