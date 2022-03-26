package conditions;

import java.util.Scanner;

public class RSPGame2 {

	public static void main(String[] args) {
		// 가위바위보 게임을 해보자
		
		// 1. 컴퓨터는 랜덤으로 가위바위보를 선택한다.
		// 2. 나도 가위바위보 중에 하나를 입력한다.
		// 3. 가위바위보를 비교해서 결과를 출력한다.
		
		System.out.println("가위바위보 게임 시작 >>>");
		Scanner sc = new Scanner(System.in);
		int comNum = (int)(Math.floor(Math.random()*3));
		System.out.println("컴퓨터가 자신의 패를 선택하였습니다 >>>");
		System.out.println("가위/바위/보 중 한개를 선택하세요 >>>");
		String myChoice = sc.next();
		
		int myNum = myChoice.equals("가위") ? 0 : myChoice.equals("바위") ? 1 : 2;
		
		if (comNum == 0) {
			if (myNum == 0) {
				System.out.println("비겼습니다");
			} else if (myNum == 1) {
				System.out.println("이겼습니다");
			} else {
				System.out.println("졌습니다");
			}			
		} else if(comNum == 1) {
			if (myNum == 1) {
				System.out.println("비겼습니다");
			} else if (myNum == 2) {
				System.out.println("이겼습니다");
			} else {
				System.out.println("졌습니다");
			}
		} else { // comNum==2
			if (myNum == 2) {
				System.out.println("비겼습니다");
			} else if (myNum == 0) {
				System.out.println("이겼습니다");
			} else {
				System.out.println("졌습니다");
			}
		}
	}
}
