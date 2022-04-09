package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression01 {

	public static void main(String[] args) {
		String[] strArr = { "bat", "baby", "bonus", "cA", "ca", "co", "c", "c0", "car", "combat", "count", "date",
				"disc" };
		Pattern pattern = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자 영단어
		
		for (String str : strArr) {
			Matcher matcher = pattern.matcher(str);
			if(matcher.matches()) {
				System.out.println(str+",");
			}
		}
	}

}
