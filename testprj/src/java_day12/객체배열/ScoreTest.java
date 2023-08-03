package java_day12.객체배열;

public class ScoreTest {

	public static void main(String[] args) {

		
		Score s = new Score("01",100,90,50);
		Score s1 = new Score("02",100,90,50);
		Score s2 = new Score("03",100,90,50);
		
		System.out.println(s.toString());
		System.out.println(s1);
		System.out.println(s2);
		
		// s, s1, s2와 같이 참조형변수를 배열로 만든것!!
		// 참조형변수의 기본값은 null
		Score[] arr = new Score[3];
		//String result = arr[0].toString();
		//nullPonterExeption
		
		arr[0]= new Score("01",100,90,50);
		arr[1]= new Score("02",100,90,50);
		arr[2]= new Score("03",100,90,50);	
	
		for(Score score : arr) {
			System.out.println(score);
			//System.out.println(score.toString());

		}
	}

}
