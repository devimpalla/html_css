package loops;

import java.util.Iterator;
import java.util.Scanner;

public class LoopsQuiz {

	public static void main(String[] args) {
		// Q1. for문을 활용하여 x의 y승을 구하세요
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("x는?");
//		int x = sc.nextInt();
//		
//		System.out.println("y는?");
//		int y = sc.nextInt();
//		
//		int result =1;
//		
//		for (int i = 0; i < y; i++) {
//		 result = result * x;
//			
//		}
//		System.out.println(result);
		
		// Q2. 3자리 이상의 정수 L, 정수 a, 정수 b를 입력받아
		//		L까지 a, b의 배수 갯수를 구하세요
		
//		System.out.println("3자리 이상의 정수 L");
//		int L = sc.nextInt();
//		System.out.println("정수 a");
//		int a = sc.nextInt();
//		System.out.println("정수 b");
//		int b = sc.nextInt();
//		
//		int count = 0;
//		
//		
//		for (int i = 0; i < L+1; i++) {
//			if(i%a == 0 || i%b ==0) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		// Q3. 음수나 0을 입력할때까지 숫자를 계속 입력받고
		// 		음수나 0이 입력되면 지금까지 입력된 수의 총합과 평균을 구하세요
		
//		double sum = 0;
//		double avg = 0;
//		double forAvg = 0;
//		System.out.println("ans 입력");
//		while (true){
//			int ans = sc.nextInt();
//			sum += ans;
//			
//			if(ans<=0) {
//				break;
//			}else {
//				forAvg++;
//			}
//		}
//		
//		avg = sum/forAvg;
//		long avg2=Math.round(avg);
//		System.out.println(sum);
//		System.out.println(avg2);
		
		
		// Q4. 컴퓨터가 랜덤으로 1~100 사이의 정수를 정하면
		// 		맞추는 게임을 구현하세요 
		// 		컴퓨터의 수보다 높은 수를 입력하면 > 더 낮은 수를 입력하세요
		//		컴퓨터의 수보다 낮은 수를 입력하면 > 더 높은 수를 입력하세요
		
//		int comNum = (int)(Math.floor(Math.random()*100))+1;
//		System.out.println(comNum);
//		System.out.println("1~100사이의 수를 입력하세요");
//		while(true) {
//			
//			int myNum = sc.nextInt();
//		if(myNum>comNum) {
//			System.out.println("더 낮은 수를 입력하세요");
//			}
//		if(myNum<comNum){
//			System.out.println("더 높은 수를 입력하세요");
//		}
//		if(myNum == comNum) {
//			System.out.println("정답입니다!");
//			break;
//		}
//		}
		
		// Q5. (Optional)
		//		다음과 같이 출력되도록 하세요
		// 		ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// 		ABCDEFGHIJKLMNOPQRSTUVWXY
		// 		ABCDEFGHIJKLMNOPQRSTUVWX
		// 		ABCDEFGHIJKLMNOPQRSTUVW
		// 		ABCDEFGHIJKLMNOPQRSTUV
		// 		ABCDEFGHIJKLMNOPQRSTU
		// 		ABCDEFGHIJKLMNOPQRST
		// 		ABCDEFGHIJKLMNOPQRS
		// 		ABCDEFGHIJKLMNOPQR
		// 		ABCDEFGHIJKLMNOPQ
		//		.....
		//		....
		// 		...
		//		A
		
		
		for (int i = 0; i < 26; i++) {
			char a ='A';
			for (int j = 0; j < 26-i; j++) {
				System.out.print((char)(a+j));
			}
			System.out.println("\n");
		}
		
		System.out.println("---------------------------------");
		String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // index > 0~25, length >26
		for (int i = 0; i < 26; i++) {
			String subStr = str.substring(0,str.length()-i);
			System.out.println(subStr);
		}
	}

}
