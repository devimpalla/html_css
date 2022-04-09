package util;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// 스트링 분해
		String src = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(src,",");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		
		String exp = "x=100*(100+10)/3";
		StringTokenizer st2 = new StringTokenizer(exp,"=-+/()*",true);
		// true 던지면 딜리미터(구분자)도 띄워줌
		
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
			
		}

	}

}
