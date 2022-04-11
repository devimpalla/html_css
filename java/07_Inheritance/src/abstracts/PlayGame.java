package abstracts;

import java.util.Scanner;

public class PlayGame {
	private Character character =null;
	private int menu;
	private boolean flag;
	private Picachu picachu = new Picachu();
	private Ccobugi ccobugi = new Ccobugi();
	private EsanghaeCci esang = new EsanghaeCci();
	private Firi firi = new Firi();
	
	Scanner sc = new Scanner(System.in);
	
	public PlayGame() {
	}
	
	public void PrintMenu(Scanner sc) {
		System.out.println("1.Eat 2.Sleep 3.Play 4.Train 5.캐릭터 변경 0.Exit");
		menu = sc.nextInt();
		
		playCharacter();
	}

	private void playCharacter() {
		switch (menu) {
			case 1:
				character.eat();
				character.printStatus();
				break;
			case 2:
				character.sleep();
				character.printStatus();
				break;
			case 3:
				character.play();
				character.printStatus();
				break;
			case 4:
				character.train();
				character.printStatus();
				break;
			case 5:
				changeCharacter();
				
				PrintMenu(sc);
				break;
			default:
				flag = true;
				break;
		}
		
		
	}
	
	public void changeCharacter() {
		
		System.out.println("원하는 캐릭터를 선택하세요 > ");
		System.out.println("1.피카츄 2.꼬부기 3.이상해씨 4.파이리");
		int chNum = sc.nextInt();
		
		switch(chNum) {
		case 1 :
			character = picachu;
			character.printCharacter();
			break;
		case 2 :
			character = ccobugi;
			character.printCharacter();
			break;
		case 3 :
			character = esang;
			character.printCharacter();
			break;
		case 4 :
			character = firi;
			character.printCharacter();
			break;
		default :
			System.out.println("캐릭터를 잘못 선택하였습니다");
			character =null;
			break;
		}
		
	}

	

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
