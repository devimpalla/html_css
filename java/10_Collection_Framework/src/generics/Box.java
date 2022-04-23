package generics;

import java.util.ArrayList;

public class Box<T extends Fruit> {
	//<T>는 예약어 이다. 박스라는 클래스가 어떤 타입을 품습니다 뭐 이런뜻
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T getItem(int idx) {
		return list.get(idx);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}
