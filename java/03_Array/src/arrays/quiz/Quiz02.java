package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 테스트에 참여할 인원수를 입력하세요
		
//		1번째 사람의 이름을 입력하세요 >
//		1번째 사람의 국어점수를 입력하세요 >
//		1번째 사람의 영어점수를 입력하세요 >
//		1번째 사람의 수학점수를 입력하세요 >
//		...
//		...
//		...
//		3번째 사람의 수학점수를 입력하세요 >
		
		// 이름 국어 영어 수학 총점 평균
		// aaa 34  45  66  ?  ?...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요");
		int students = sc.nextInt();
		
		String[] stuname = new String[students];
		int[][] stuArr =new int[students][5];
		for (int i = 0; i < students; i++) {
			System.out.println((i+1)+"번째 사람의 이름을 입력하세요");
			stuname[i] = sc.next();
			System.out.println((i+1)+"번째 사람의 국어점수를 입력하세요");
			int korean = sc.nextInt();
			System.out.println((i+1)+"번째 사람의 영어점수를 입력하세요");
			int english = sc.nextInt();
			System.out.println((i+1)+"번째 사람의 수학점수를 입력하세요");
			int math = sc.nextInt();
			
			int sum = korean+english+math;
			int avg =sum/3;
			
			
			stuArr[i][0]=korean;
			stuArr[i][1]=english;
			stuArr[i][2]=math;
			stuArr[i][3]=sum;
			stuArr[i][4]=avg;
					
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < stuArr.length; i++) {
			
				System.out.print(stuname[i]+"\t");
				System.out.print(stuArr[i][0]+"\t");
				System.out.print(stuArr[i][1]+"\t");
				System.out.print(stuArr[i][2]+"\t");
				System.out.print(stuArr[i][3]+"\t");
				System.out.print(stuArr[i][4]+"\t"+"\n");
			
			
		}
		
	}

}
