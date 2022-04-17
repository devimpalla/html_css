package attacker;

class Unit{ // 추상클래스여도 상관없음
	int currHp; // 유닛의 체력
	int x; // 유닛의 x좌표 위치
	int y; // 유닛의 y좌표 위치
}

public class Fighter extends Unit implements Fightable{

	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
