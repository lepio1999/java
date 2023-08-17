package java_day15;

public class DTest {
	public static void main(String[] args) {

		D d = new D();
		E e = new E();
		// MyRunnable 인터페이스를 구현한 개게를 넘겨줘야함
		d.매서드(e);// 매개변수로 인터페이가 있다면. => 인터페이스를 구현한 객체를 인자로 넘겨줘야함

		d.매서드(new F()); // 익명객체 , 일회성으로 객체를 생성할 때 익명객체사용함
		// d.매서드(new MyRunnable(){});
		// 익명 클래스를 작상하는 방법 new 인터페이스 이름(){};
		// 익명 클래스 작성 할 수 있다.
		d.매서드(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("실행코드");

				for (int i = 1; i <= 3; i++) {
					System.out.print("★");
				}

			}
		});

		d.매서드(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("실행코드!!");
				for (int i = 1; i <= 9; i++) {
					System.out.println(i * 2);
				}
			}
		});

		d.매서드(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("실행코드!!");
				for (int i = 2; i <= 9; i++) {
					for (int j = 1; j <= 9; j++) {
						System.out.println(i * j);
					}
				}

			}
		});

		// 인터페이스를 구현할 때
		// 이름이 있는 클래스를 작성 implements 해야함
		// 이름이 없는 클래스 (익명클래스) =>상속받아서 클래스를 만들 때만 익명클래스 작성 가능
		d.매서드(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("나정코드 실행해 주세요!!!");
				
			}});
		
		G g = new G();
		d.매서드(g);
		
		d.매서드(new G());
		
	}

}
