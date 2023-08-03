package 허재혁실기평가;

public class Quiz9_Score {
	

	String name;
	int kor;
	int eng;

	
	public Quiz9_Score() {
		
	}
	
	
	public Quiz9_Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}
	
	public String calGrade() {
		int avg = (kor+eng)/2;
		if(avg>=90){
			return "A";
		}else if(avg>=80){
			return "B";
		}else if(avg>=70) {
			return "C";
		}else {
			return "F";
		}
		

	}
	
	@Override
	public String toString() {
		return name+" " + kor +" " + eng+ " "+calGrade();
	}

	
	
}
