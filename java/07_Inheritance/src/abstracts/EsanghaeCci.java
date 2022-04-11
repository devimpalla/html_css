package abstracts;

public class EsanghaeCci extends Character{
	public EsanghaeCci() {
		hp = 80;
		mp = 50;
		name = "이상해씨";
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
