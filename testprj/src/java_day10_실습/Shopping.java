package java_day10_실습;

public class Shopping {

	String numthiser;
	String id;
	String day;
	String name;
	String numthiser2;
	String add;

	public void input() {
		this.numthiser = "201803120001";
		this.id = "athisc123";
		this.day = "2018년3월12일";
		this.name = "홍길순";
		this.numthiser2 = "😛D0345-12";
		this.add = "서울시 영등포구 여의도동 20번지";
		
	}
	
	public void printinfo() {
		System.out.println("주문번호: "+numthiser);
		System.out.println("아이디: "+id);
		System.out.println("날짜: "+day);
		System.out.println("이름: "+name);
		System.out.println("제품번호: "+numthiser2);
		System.out.println("주소: "+ add);
		
	}
	

}
