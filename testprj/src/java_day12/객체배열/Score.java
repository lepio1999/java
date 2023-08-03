package java_day12.객체배열;

public class Score {

	String no;
	int kor;
	int eng;
	int tot;

	public Score() {
	}

	public Score(String no, int kor, int eng, int tot) {
		super();
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.tot = tot;
	}

	@Override
	public String toString() {

		return no + " " + kor + " " + eng + " " + tot;
	}
}
