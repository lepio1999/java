package java_day7;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] Arr3 = {{"월", "화", "수", "목", "금", "토", "일"},
                {"맑음", "흐림", "맑음", "흐림", "맑음", "흐림", "맑음"}};

for (int i = 0; i < Arr3.length; i++) {
  for (int j = 0; j < Arr3[i].length; j++) {
      System.out.print(Arr3[i][j] + " ");
  }
  System.out.println(); // Move to the next line after printing each row
}

	}

}
