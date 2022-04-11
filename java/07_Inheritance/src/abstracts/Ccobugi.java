package abstracts;

public class Ccobugi extends Character {
	
	public Ccobugi() {
		hp = 90;
		mp = 40;
		name = "꼬부기";
	}

	@Override
	public void eat() {
		mp += 10;
		
	}

	@Override
	public void sleep() {
		mp += 20;	
		
	}

	@Override
	public void play() {
		mp -= 20;
		hp += 5;
		
	}

	@Override
	public boolean train() {
		mp -= 10;
		hp += 10;
		levelup();
		return checkMp(); // Character의 public boolean checkMp()와 연결하기 위함
	}

	@Override
	public void levelup() {
		if (hp >= 40) {
			hp -= 40;
			level++;
		}
		
	}
	
}
