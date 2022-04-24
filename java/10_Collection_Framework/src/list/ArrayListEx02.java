package list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add(1,"A-1"); // 지정한 인덱스에 끼워넣기 >  인덱스 번호가 밀려난다
		
		System.out.println(strList);
		
		ArrayList<String> strList2 = new ArrayList<String>(strList.subList(2,4));
		System.out.println(strList2);
		
		strList.addAll(strList.size(),strList2);
		strList.addAll(1,strList2); // 1번 인덱스에 strList2를 넣는것과 같다.
		//인덱스 번호 밀리기 때문에 주의할 것!
		System.out.println(strList);
		
		strList.retainAll(strList2); // 두 리스트가 겹치는 것을 제외하고 삭제(strList)
		System.out.println(strList);
		
		System.out.println(strList.containsAll(strList2));
		//strList에 strList2에 있는 요소들이 전부 포함되어 있느냐
		
		strList2.remove(1); // 인덱스 번호에 있는 요소 제거
		System.out.println(strList2);
		
		strList.clear(); // 안에 값 비우기
		System.out.println(strList);
		System.out.println(strList.size() == 0); // 리스트 내의 값 존재 여부는 null로 판단하지 않음!!
		System.out.println(strList.isEmpty());
		
	}

}
