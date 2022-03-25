package printEx;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		String name ="Min";
		int age = 25;
		float height = 156.7f;
		double weight = 50.2;
		char blood = 'O';
		boolean vachine = true;
		long asset = 2148000000L;
		String description = "현재는 OpenAPI 강의중";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 멤버의 정보를 입력하세요");
		System.out.println("이름 >");
		name = sc.next();
		System.out.println("나이 >");
		age = sc.nextInt();
		System.out.println("키 >");
		height = sc.nextFloat();
		System.out.println("몸무게 >");
		weight = sc.nextDouble();
		System.out.println("혈액형 > ");
		blood = sc.next().charAt(0);
		System.out.println("백신 접종 여부 >");
		vachine = sc.nextBoolean();
		System.out.println("자산 >");
		asset =sc.nextLong();
		System.out.println("부가정보 >");
		description = sc.nextLine();
		
		
		//c 언어에서 사용하는 포맷형
		System.out.printf("%s,%d,%f,%f,%s,%s, %d, %s",
				name, age, height, weight, blood, vachine, asset, description);
		
	}

}
