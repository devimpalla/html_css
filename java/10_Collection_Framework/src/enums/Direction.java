package enums;

public enum Direction {
	EAST(1,">"),SOUTH(2,"V"),WEST(3,"<"),NORTH(4,"^");
	
	private static final Direction[] DIRS_ARR = Direction.values();
	private final int value;
	private final String sign;
	
	Direction(int value, String sign){
		this.value = value;
		this.sign = sign;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getSign() {
		return this.sign;
	}
	
	public static Direction ofDirection(int dir) {
		if(dir < 1 || dir > 4) {
			throw new IllegalArgumentException("범위 초과 : " + dir);
		}
		return DIRS_ARR[dir - 1];
	}
	
	// num 값을 받으면 90도씩 시계방향으로 회전시키는 메서드
	public Direction rotate(int num) {
		num = num%4;
		if(num < 0) { // num이 음수일 때 시계반대방향으로 회전
			num += 4;
		}
		return DIRS_ARR[(value-1 + num) % 4]; // 데이터가 저장된 배열
	}
	
	public String toString() {
		return name()+" " + getSign(); // name()은 Enum클래스가 가지고 있는 메서드!
	}
}
