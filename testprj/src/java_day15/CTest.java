package java_day15;

public class CTest {

	public static void main(String[] args) {
		
		C c = new C();
		try {
			c.매서드(200);
		} catch (OverNumberException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			
		}
		
		System.out.println("정상 종료");

	}

}
