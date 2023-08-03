package 허재혁실기평가;

public class Quiz9_ScoreTest {

	public static void main(String[] args) {
		
		Quiz9_Score student1 = new Quiz9_Score("이학생",90,90);
		Quiz9_Score student2 = new Quiz9_Score("김학생",80,82);
		Quiz9_Score student3 = new Quiz9_Score("전학생",60,70);
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	}

}
