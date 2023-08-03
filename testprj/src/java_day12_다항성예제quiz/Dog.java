package java_day12_다항성예제quiz;

public class Dog extends Animal {
	String 짖는다;
	public Dog(String name, int age, String 짖는다) {
		super(name, age);
		this.짖는다=짖는다;
	}
	
	public String toString() {
		return name+age+짖는다;
	}
	

	

}
