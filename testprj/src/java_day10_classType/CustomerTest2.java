package java_day10_classType;

public class CustomerTest2 {

	public static void main(String[] args) {

		// 자료형이 있으면 자료형에 맞는 변수를 만들 수 있어야 한다.

		int a;
		a = 10;

		// 참조형변수의 초기값은 null입니다.
		// 참조형변수를 초기화하고 싶을 땐 null로 초기화
		// null => 아무것도 참조하지 않음을 나타내는값
		Customer customer = null;// customer형 변수가 만들어지지 않았다.
		customer = new Customer(); // new를 통해서 Customer형 변수가 만들어진다.\
		// customer변수 참조형변수입니다.
		// customer형 변수가 있는 위치, 레퍼런스를 저장하는 참조형변수

		customer.id = "test01";
		customer.pw = "1234";
		customer.name = "홍길동";
		customer.address = "서울시 마포구";

		System.out.println(customer.id);
		System.out.println(customer.pw);
		System.out.println(customer.name);
		System.out.println(customer.address);

	}

}