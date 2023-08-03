package java_day12_다항성예제quiz;

public class Cat extends Animal {
	
	int born;
	public Cat(String name, int age, int born) {
		super(name, age);
		this.born=born;
	
	}
	
	public String toString() {
		return name+age+born;
	}
	

}
