package day15.인터페이스;

public class Random implements MyRunnable{

	@Override
	public void run() {
		
		String bab[] = {"a","b","c","d"};
		
		int index = (int)(Math.random()*bab.length);
		String randombab = bab[index];
		
		System.out.println(randombab);
		
	}

}
