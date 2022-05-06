package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(11);
		list.add(111);
		list.add(1111);
		
		System.out.println(list);
		list.forEach(i -> System.out.println(i));
		
		Stream<Integer> stream = list.stream();
		
		// 메서드 참조 > java 8 이상
		stream.forEach(System.out::println); // 클래스.메서드(파라미터) >  클래스::메서드명 , 변수명::메서드명
	
		String[] names = new String[] {"kim", "lee", "park", "choi", "jung"};
		Stream<String> stream2 = Arrays.stream(names);
		stream2.forEach(elem -> System.out.print(elem + ","));
		
		Stream<String> stream3 = Arrays.stream(names, 1, 4);
		stream3.forEach(elem -> System.out.print(elem + ","));
		
	}

}
