package java_day14.ioEx;

import java.io.Serializable;

public class Score implements Serializable {

		String name;
		int Kor;
		
		public Score() {
			
		}
		
		public Score(String name, int kor) {
			super();
			this.name = name;
			Kor = kor;
		}
		
		
		
		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}


		public int getKor() {
			return Kor;
		}


		public void setKor(int kor) {
			Kor = kor;
		}


		@Override
		public String toString() {
			return "Score [name=" + name + ", Kor=" + Kor + "]";
		}
		

	}

