package java_day11_inheritance상속사용;

public class Test {

	public static void main(String[] args) {
		
		Professor p = new Professor();
		p.공부하기();
		p.걷기();
		p.말하기();
		p.잠자기();
		p.연구하기();
		
		Researcher re = new Researcher();
		re.걷기();
		re.말하기();
		re.잠자기();
		re.연구하기();
		re.먹기();
		
		Student st = new Student();
		st.걷기();
		st.공부하기();
		st.말하기();
		st.먹기();
		st.잠자기();
		
		StudentWorker sw = new StudentWorker();
		sw.걷기();
		sw.말하기();
		sw.먹기();
		sw.일하기();
		sw.잠자기();
		
		
		
		

	}

}
