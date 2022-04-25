package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("abc","1234");
		map.put("bcd","2345");
		map.put("cde","3456");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw를 입력해주세요");
			System.out.println("id > ");
			String id = sc.next();
			System.out.println("pw > ");
			String pw = sc.next();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공~");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			}else {
				System.out.println("입력한 id는 존재하지 않습니다!");
				break;
			}
		}
	}

}
