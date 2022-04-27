package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class Member{
	String name;
	int age;
	
	Member(String name, int age){
		this.age = age;
		this.name= name;
	}
	public String toString() {
		return name + " : " + age;
	}
}

public class SetEx02 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
//		set.add("java"); // 얘네는 일반적인 값이라 중복으로 알아먹고
//		set.add("java");
		
		set.add(new Member("Park",40)); // 얘네는 객체라서 중복처리 안함!
		set.add(new Member("Park",41));
		set.add(new Member("Park",42));
		set.add(new Member("Park",43));
	
		System.out.println(set);
		
		for (Member member : set) {
			System.out.println(member.toString());
		}
		Iterator<Member> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Member member = (Member) iterator.next();
			System.out.println(member);
		}
	}

}
