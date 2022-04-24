package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// ArrayList > 표면적인 순서는 인덱스 이지만 내부 저장 순서는 랜덤이다.
		// LinkedList는 ArrayList의 저장방식으로 인한 검색 및 조회의 성능저하를 극복하기 위해 만들어짐
		// 저장, 수정, 삭제 성능은 ArrayList에 비해 현저히 늦음
		
		List<String> al = new ArrayList<>(2000000);
		List<String> ll = new LinkedList<>();
		
		add(al);
		add(ll);
		
		System.out.println("ArrayList : "+ access(al));
		System.out.println("LinkedList : "+ access(ll));

	}

	private static long access(List<String> list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		
		return end-start;
	}

	private static void add(List<String> list) {
		for (int i = 0; i < 2000000; i++) {
			list.add(i+"");
		}
		
	}

}
