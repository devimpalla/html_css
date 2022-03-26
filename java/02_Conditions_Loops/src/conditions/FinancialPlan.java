package conditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FinancialPlan {

	public static void main(String[] args) {
		// 1. 꼭 구매하고 싶은 것 입력받기. 예) 아파트, 자동차, 등등..
		// 2. 구매할 대상의 가격 입력받기
		// 3. 미래에 수령할 월급 입력받기 => 현실적으로 입력
		// 4. 월급의 몇 %를 저축할지? => 현실적으로 입력
		// 5. 대상을 구매하기 위해 소요되는 기간 구하기 (월, 년 상관없음)
		// 6. 연 이율은 적금을 기준으로 2.5%로 가정
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("꼭 구매하고 싶은것");
		String stuff = sc.next();
		
		System.out.println("가격은?");
		int price = sc.nextInt();
		
		System.out.println("월급은 얼마나?");
		double sal = sc.nextDouble();
		
		System.out.println("월급의 몇 퍼센트 저축?");
		double persent = sc.nextDouble();
		double bankRate = 2.5/100/12;
		
		// 총수령액(T) = (월납입금(A) x 납입월[n]) + (월납입금(A) x (납입월[n](납입월[n]+1)/2) x (연이율[r]/12)) => 단리적금계산식

		// T = (A * n) + (A * (n * (n + 1) / 2) * (r / 12))

		// 반복문과 조건문을 활용하여 n 값을 찾으면 됨... => 이 로직은 반복문을 학습한 후 다시진행
		
		double t =0;
		int n= 0;
		final double A =sal*(persent*100);
		
		do {
			t = (A*n) + (A*(n*(n+1)/2)*bankRate);
			n++;
		} while (t<price);
		System.out.println(stuff + "을 구매하기 위해 필요한 최소 저축 개월수 :" + n + "개월");
		
	}

}
