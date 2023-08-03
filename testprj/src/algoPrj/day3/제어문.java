package algoPrj.day3;

public class 제어문 {

	public static void main(String[] args) {
		
		//분기문
		
		//if문 형식
		
		/*
		 * if(조건식){
		 * }
		 * */
		
		/*
		 * if(조건식){
		 * }else(){
		 * 
		 * }
		 * */
		
		/*
		 * if(조건식){
		 * }else if(조건식){
		 * 
		 * }else if(조건식){
		 * 
		 * }else{
		 * 
		 * */
		
		int score = 90;
		
		if(score  >=90) {
			System.out.println("학점은 A");
		}else if( score >=80) {
			System.out.println("학점은 B");
		}
		
		if(score>=90) {
			System.out.println("학점은 A");
		}
		if(score>=80) {
			System.out.println("학점은 B");
		}
		

	}

}
