package java_day9_실습;

public class Score_cc {

	public static void main(String[] args) {
		
		Score c = new Score();
		
		c.name = "홍길동";
		c.kor = 90;
		c.eng = 80;
		c.avg = ((c.kor+c.eng)/2);
		
		System.out.println("이름: "+c.name);
		System.out.println("국어: "+c.kor);
		System.out.println("영어: "+c.eng);
		System.out.println("평균: "+c.avg);
		
		

	}

}
