package attacker;

interface Attackable{ // 자바 파일의 구조상 default(package) 처럼 보일 뿐!
	
	void attack (Unit unit); // 생략되어도 public abstract이다!
}

interface Movable{// 인터페이스는 규격(명세서)의 의미로 사용하므로 범위적 제한을 두지 않는다
	public abstract void move(int x, int y);
}

public interface Fightable extends Attackable, Movable { 
//	final int x = 0; 상수만 선언 가능
}
