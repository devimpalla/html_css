package abstracts;

public abstract class Character {
	protected int hp;
	protected int level;
	protected int mp;
	protected String name;
	
	
	public abstract void eat();
	public abstract void sleep();
	public abstract void play();
	public abstract boolean train();
	public abstract void levelup();
	
	
	
	public boolean checkMp() {
		return mp <= 0? true : false;
	}
	public void printStatus() {
		System.out.println("현재 "+name+" 의 상태...");
		System.out.println("HP : " + hp);
		System.out.println("MP : " + mp);
		System.out.println("Level : " + level);
	}
	
	public void printCharacter() {
		System.out.println("선택하신 캐릭터는 "+name+" 입니다.");
		printStatus();
	}
}
