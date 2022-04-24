package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(new Integer(3)); // new Integer(43) > Deprecated
		list1.add(15);
		list1.add(23);
		list1.add(34);
		
		for (int i=0; i<list1.size(); i++) {// 길이는 size()메서드를 사용
			System.out.println("index" + i + " : " + list1.get(i));
		}
		System.out.println(list1);
		list1.contains(43); //43을 포함하고 있느냐.. boolean으로 줌
	}

}
