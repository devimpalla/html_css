package dataType;

public class NumberMethods {

	public static void main(String[] args) {
		int num = -1024;
		
		//반올림
		System.out.println(Math.round(1024.56)); //1025
		
		// 절대값
		System.out.println(Math.abs(num));
		
		//최댓값, 최솟값
		System.out.println(Math.max(1024, num));
		System.out.println(Math.min(1024, num));
		
		// 실수가 갖을 수 있는 정수값
		System.out.println(Math.ceil(1024.56)); // 1025.0
		System.out.println(Math.floor(1024.56)); // 1024.0
		System.out.println(Math.floor(-1024.56)); //-1025.0
		
		// 로그 => 어떤 특정한 수를 1로 만들기 위해 필요한 나누기 횟수
		// 웹 분야에서는 사용빈도가 매우낮음=> 데이터 분석분야에서는 자주 사용
		System.out.println(Math.log(1024.56));
		System.out.println(Math.log10(1024.56));
		System.out.println(Math.log1p(1024.56));
		
		// 제곱
		System.out.println(Math.pow(2,10));//1024.0 2의 10승
		
		// 루트
		System.out.println(Math.sqrt(144)); //12.0
		
		// 랜덤
		System.out.println(Math.random()); //0~1 사이의 실수;
		System.out.println((int)(Math.floor(Math.random()*45)+1)); // 1~45 랜덤정수
	}

}
