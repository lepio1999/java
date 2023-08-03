package java_day10_실습;

public class James {
	
	int age;
	String name;
	boolean isMarried;
	int child;
	
	public void input() {
		this.age =40;
		this.name ="james";
		this.isMarried=true;
		this.child=3;
		
	}
	public void printInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("결혼: "+this.isMarried);
		System.out.println("자식: "+this.child);
		
	}

}
