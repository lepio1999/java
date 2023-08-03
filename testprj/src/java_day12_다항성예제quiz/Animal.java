package java_day12_다항성예제quiz;

public class Animal {
	
	String name;
	int age;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public String toString() {
		return "이름"+name+"나이"+age;
	}

}
