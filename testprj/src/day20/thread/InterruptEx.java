package day20.thread;

public class InterruptEx {

	public static void main(String[] args) {
		ThreadEx th = new ThreadEx();
		th.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.interrupted();
		System.out.println("메인 종료");

	}

}

//////////////////////////
class ThreadEx extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("자고 있는데 깨어남");
				return;
			}
			System.out.println((i + 1) + "hi ^^");

			if (isInterrupted()) {
				System.out.println("인터럽트 받음");
				return;
			}

		}

	}
}
