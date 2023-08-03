package algoPrj.day3;

public class 민규S_1 {

	public static void main(String[] args) {
	      double ha = 2500000;
	      double ka = 1800000;
	      int y = 1999;
	      double Alpha = 1.036;
	      double Beta = 1.042;

	      while (ha > ka) {
	         y++;
	         ha = ha * Alpha;
	         ka = ka * Beta;

	      }
	      System.out.println(y);
	   }

	} 
