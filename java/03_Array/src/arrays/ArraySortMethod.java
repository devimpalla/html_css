package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortMethod {

	public static void main(String[] args) {
		int[] intArr = new int[12];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random()*100))+1;
			System.out.print(intArr[i]+" ");
		}
		System.out.println("\n=================================");
		
		Arrays.sort(intArr);
		
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println("\n=================================");
		// 역정렬
//		Arrays.sort(intArr,Collections.reverseOrder()); // 데이터 타입이 object이어야 가능
		
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println("\n=================================");
	}

}
