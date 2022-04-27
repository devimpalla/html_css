package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		Set set = new HashSet();
		int count = 0;
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); // set은 중복되는 값은 하나만으로 취급하기 때문에 중복 되지 않음
			count++;
		}
		System.out.println(count);
		System.out.println(set);
		
		List list = new LinkedList<>(set);
		Collections.sort(list);
		
		System.out.println(list);
		
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(set);
//		}
	}

}
