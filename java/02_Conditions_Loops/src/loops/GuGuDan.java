package loops;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요");
		int dan = sc.nextInt();
		int i =2;
		while(i<10) {
			System.out.println(dan + "X" + i +"=" +(dan*i));
			i++;
		}

	}

}
