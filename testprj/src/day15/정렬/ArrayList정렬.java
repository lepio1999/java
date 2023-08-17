package day15.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList정렬 {

	public static void main(String[] args) {

		
		ArrayList<Score> list = new ArrayList();
		
		//
		
		//Collections.sort(list);
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score2 s1 = (Score2)o1;
				Score2 s2 = (Score2)o2;
				return s1.getKor() - s2.getKor();
			}});
		
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score2 s1 = (Score2)o1;
				Score2 s2 = (Score2)o2;
				return s1.getEng()-s2.getEng();
			}});
		
	}

}
