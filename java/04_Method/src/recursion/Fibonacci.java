package recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// 피보나치 수열
		// 앞의 두개의 수의 합으로 다음 값을 만들어 내는 수열
		// 1,1,2,3,5,8,13,21,34,55......\
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알고싶은 자리 수 입력 > ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(fibo(i)+" ");
		}
		
	}

	private static int fibo(int i) {
		if(i==0 || i==1) {
			return 1;
		}else {
			return fibo(i-2)+ fibo(i-1);
		}
	}

}
