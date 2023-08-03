package java_day11_quiz;

import java_day11_inheritance.Cat;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.집을지킨다();
		
		Cat c = new Cat();
		c.쥐를잡는다();
		
		Animal animal = new Dog(); //업 캐스팅
		animal.짖는다();
		
		Dog c2 = (Dog)animal; // 다운 캐스팅(명시적형변환)
		 c2.집을지킨다();

	}

}
