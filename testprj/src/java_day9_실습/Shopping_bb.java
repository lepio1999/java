package java_day9_실습;

public class Shopping_bb {

	public static void main(String[] args) {
		
		Shopping b = new Shopping();
		b.number = "201803120001";
		b.id = "abc123";
		b.day = "2018년3월12일";
		b.name = "홍길순";
		b.number2 = "😛D0345-12";
		b.add = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("제품번호: "+b.number);
		System.out.println("주문자아이디: "+b.id);
		System.out.println("주문날짜: "+b.day);
		System.out.println("주문자이름: "+b.name);
		System.out.println("주문상품번호: "+b.number2);
		System.out.println("배송주소: "+b.add);
		

	}

}
