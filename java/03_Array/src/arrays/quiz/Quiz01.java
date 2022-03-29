package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 24절기 맞추기 게임
		String[] seasonal = {
				"입춘","우수","경칩","춘분","청명","곡우","입하",
				"소만","망종","하지","소서","대서","입추","처서",
				"백로","추분","한로","상강","입동","소설","대설",
				"동지","소한","대한"
		};
		// ? 번째 절기는 무엇입니까?
		// 몇번 시도 했는지도 출력
		
		int a = (int)(Math.floor(Math.random()*24))+1;
		System.out.println(a+"번째 절기는 무엇입니까?");
		
		Scanner sc = new Scanner(System.in);
		String comAns = seasonal[a-1];
		
		System.out.println(comAns);
		int count = 1;
		String meAns = sc.next();
		
		while(true)
		if(meAns.equals(comAns)) {
			System.out.println("정답입니다");
			System.out.println("시도한 횟수는 총 "+count+"번 입니다.");
			break;
		}else {
			System.out.println("틀렸습니다 다시 시도해보세요");
			meAns=sc.next();
			count++;
		}
		
	}

}
