package 허재혁실기평가;

import java.util.Random;

public class Quiz6 {

	public static void main(String[] args) {

		Random random = new Random();
		int randomNum = random.nextInt();
		if (randomNum < 0) {
			randomNum *= -1;
		}

		System.out.println(randomNum);

	}

}
