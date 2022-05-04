package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx03 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		// 리스트 요소 출력
		list.forEach(i -> System.out.println(i + ","));
		System.out.println(list);
		
		// 리스트에서 조건에 부합한 요소들을 필터링
		list.removeIf(x -> x%2==0 || x%3==0);
		System.out.println(list);
		
		// 리스트의 각 요소에 매핑 연산
		list.replaceAll(y -> y*5);
		System.out.println(list);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
