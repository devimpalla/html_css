package util;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		int rnum = (int)(Math.floor(Math.random()*100))+1; // 1~100
		System.out.println(rnum);
		
		Random r = new Random();
		int rnum2 = r.nextInt(100) + 1; // 1~100
		System.out.println(rnum2); 
	}

}
