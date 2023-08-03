package java_day11_quiz;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		print(a);
		
		Cat c = new Cat();
		print(c);
		
		Dog d = new Dog();
		print(d);

		

		}

	public static void print(Animal animal) {
		animal.짖는다();

	}
	public static void printDog(Animal Dog) {
		Dog.짖는다();
	}
	public static void printCat(Animal Cat) {
		Cat.짖는다();
	}
}
