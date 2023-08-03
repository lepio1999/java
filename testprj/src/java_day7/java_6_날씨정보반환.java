package java_day7;

public class java_6_날씨정보반환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		extracted();
		
		/*String [][] Arr3 = {{"월", "화", "수", "목", "금", "토", "일"},
							{"맑음","흐림","맑음","흐림","맑음","흐림","맑음"}};
		
		for (int i = 0; i < Arr3.length; i++) {
		    int random = (int) (Math.random() * Arr3[i].length); // 랜덤한 값 생성 (0 ~ 6)
		    System.out.println(Arr3[i][random]);
		}*/

						
		}

	private static void extracted() {
		String [] stringArr = {"월", "화", "수", "목", "금", "토", "일"};
		String [] stringArr2 = {"맑음","흐림","비"};
		
		for(int i=0; i<stringArr.length; i++) {
			int random = (int) (Math.random() * stringArr2.length);
			System.out.println(stringArr[i]+" "+ stringArr2[random]);
		}
	}
	
}

