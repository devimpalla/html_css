package attacker;

public class CharacterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit) {
			System.out.println("f는 Unit 클래스의 자손입니다.");
		}
		if (f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스의 구현체입니다.");
		}
		if (f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스의 구현체이기도 합니다.");
		}
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스의 구현체이기도 합니다.");
		}
		if (f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손입니다.");
		}
		
		// 클래스는 extends 클래스
		// 인터페이스는 extends 인터페이스
		// 클래스는 implements 인터페이스
		// 인터페이스는 클래스를 implements 못함 > 인터페이스는 클래스보다 상위개념의 규격이기 때문.
		// 인터페이스의 규격에 따라 클래스가 상세화 된 객체로 만들어지는 형태
	}
}
