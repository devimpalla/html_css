package loops;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		// for문은 (초기값; 조건식; 증감식)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요 > ");
		int dan =sc.nextInt();
		for (int i = 2; i < 10; i++) {
			System.out.println(dan + "X" + i + "=" + (dan*i));
		}
	}

}
