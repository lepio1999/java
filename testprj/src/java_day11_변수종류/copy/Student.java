package java_day11_변수종류.copy;

//학생 한명이 가져야할 정보를 표현하기 위한 자료형
public class Student {

	String name;
	int kor;
	int eng;
	double avg;
	String teacher;

	// 기본 생성자
	public Student() {
	}

	// 매개변수있는 생성자

	public Student(String name, int kor, int eng, String teacher) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (kor+eng)/2.0;
		this.teacher = teacher;
	}

	public String toString() {
		return name + kor + " " + eng + " " + avg + teacher;
	}

}
