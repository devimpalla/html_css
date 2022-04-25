package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		Map map = new HashMap();
		// map에 key=value 추가
		map.put("kim", 90);
		map.put("lee", 100);
		map.put("park", 80);
		map.put("jeong", 95);
		map.put("choi", 85);
		
		// 순환을 위해 set타입변경
		Set set = map.entrySet();
		// 순환구조로 변경
		Iterator iterator = set.iterator();
		
		//순환구조에서 조회
		while(iterator.hasNext()) {// 그 다음꺼가 있냐
			// 다시 key=value 형태로 변경
			Map.Entry entry = (Map.Entry) iterator.next();
			// key, value 조회
			System.out.print("이름:"+entry.getKey());
			System.out.println("점수:"+entry.getValue());
		}
		
		Set nameSet = map.keySet();
		System.out.println("명단:" + nameSet);
		
		Collection values = map.values();
		iterator = values.iterator();
		
		int total = 0;
		while (iterator.hasNext()) {
			int i = (int)iterator.next();
			total += i;
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total/values.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}

}
