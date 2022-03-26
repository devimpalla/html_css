package conditions;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 몇시니?");
		int nowHour = sc.nextInt();

		if (nowHour < 9) {
			System.out.println("굿모닝");
		} else {
			System.out.println("일어나야지??");
		}
		if (nowHour < 13) {
			System.out.println("굿 애프터눈");
		} else {
			System.out.println("신호보내셔야죠~");
		}

		// if > else > if else

		System.out.println("백신 맞았니? > y,n,w");
		String ans = sc.next();

		if (ans.equals("y")) {
			System.out.println("굿~");
		} else if (ans.equals("n")) {
			System.out.println("왜????????????");
		} else {
			System.out.println("그래 빨리 맞어");
		}
	}

}
