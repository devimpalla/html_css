package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class WithList {
	
	// 다형성을 이용하면 여러타입의 하위객체들을 통일된 상위객체의 타입으로 이용할 수 있다.
	// 아래의 코드 처럼 타입마다 검증하는 로직이 필요가 없게 되어 코드량을 획기적으로 줄일 수 있다.

	public static void main(String[] args) {
		List list = new ArrayList();
		List linkedList = new LinkedList();
		List vector = new Vector();
		List stack = new Stack();
		
		list.add(linkedList);
		list.add(linkedList);
		list.add(vector);
		list.add(stack);
		
		for (int i = 0; i < list.size(); i++) {
			List el = (List) list.get(i);	
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof ArrayList) {
//				ArrayList al = list.get(i);
			}else if(list.get(i) instanceof LinkedList) {
//				ArrayList ll = list.get(i);
			}
		}

	}
}
