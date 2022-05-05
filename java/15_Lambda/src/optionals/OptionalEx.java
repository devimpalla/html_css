package optionals;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// java 1.8 이상
		// 데이터를 변수에 저장할 때 데이터의 null 여부를 판단하여
		// NullPointerException 발생을 사전에 필터링 할 수 있음
		
		Optional<String> option = Optional.ofNullable("빈 값이 아니에요~"); // ""자리에 null값 들어오면
		System.out.println(option); // empty로 뜸 (null 들어갔을 때)
		System.out.println(option.get());
		System.out.println(option.isPresent());
		System.out.println(option.isEmpty());
		
		
		if(option.isEmpty()) {
			System.out.println("null 이면 요롷게 저렇게 처리하세요~~");
		}
		
		Optional<String> option2 = Optional.empty(); // null셋팅
		System.out.println(option2.orElse("빈 옵셔녈 객체 입니다"));
		System.out.println(option.orElseGet(String::new)); // 비어있으면 위에꺼 나오거나 스트링객체 하나 생성하거나..
	}

}
