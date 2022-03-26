package conditions;

import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		// 가위바위보 게임을 해보자
		
		// 1. 컴퓨터는 랜덤으로 가위바위보를 선택한다
		// 2. 나도 가위바위보 중에 하나를 입력한다
		// 3. 가위바위보를 비교해서 결과를 출력한다.
		
		int randomNum = (int)(Math.floor(Math.random()*3)+1);
		System.out.println(randomNum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터랑 하는 가위바위보");
		System.out.println("입력하세요");
		String me = sc.next();
		
		
		if (randomNum==1) {
			if(me.equals("가위")) {System.out.println("비겼다~");}
			if(me.equals("바위")) {System.out.println("이겼다!!!");}
			if(me.equals("보")) {System.out.println("졌다..");}
		}
		else if (randomNum==2) {
			if(me.equals("바위")) {System.out.println("비겼다~");}
			if(me.equals("보")) {System.out.println("이겼다!!!");}
			if(me.equals("가위")) {System.out.println("졌다..");}
		} 
		else {
			if(me.equals("보")) {System.out.println("비겼다~");}
			if(me.equals("가위")) {System.out.println("이겼다!!!");}
			if(me.equals("바위")) {System.out.println("졌다..");}
		} 

	}

}
