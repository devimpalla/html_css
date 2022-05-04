package lambda;

import java.util.ArrayList;

public class LambdaEx01 {

	public static void main(String[] args) {
		// java 8 부터 지원하는 표현식
		// 전체코드에서 적극적으로 활용되지는 않음
		// 일부 메서드 구현의 편리성을 위해 사용되나
		// 가독성이 현저히 낮아서 자바 개발자들에게 큰 호응은 없음

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		
		for (Integer n : numbers) {
			System.out.println(n);
		}
		
		System.out.println("----");
		
		numbers.forEach((n) -> {
			System.out.println(n);
		});
		
		
	}

}
