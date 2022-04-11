package abstracts;

import java.util.Scanner;

import newT.PlayGame2;

public class GameStarter {

	public static void main(String[] args) {
		// 2021-11-11 주말과제
		// 나머지 캐릭터를 생성하는 코드와 각 캐릭터 클래스를 만드세요
		// 현재는 게임을 종료하면 생성한 캐릭터가 사라지고 다시 게임을 시작하면 초기화 됩니다.
		// 이 구조에서 게임 종료 전에 캐릭터를 변경선택할 수 있는 구조로 만들고
		// 각 캐릭터들은 게임 종료 전에는 캐릭터의 정보값이 초기화 되지 않고 사용할 수 있게 만드세요
		// 필요한 추상클래스, 클래스를 더 만드는 것도 가능합니다.
		
		// midaseye@naver.com > _java_hw_201115_이름.zip > 월요일 수업시작 전까지
		
		Scanner sc = new Scanner(System.in);
		
		PlayGame pg = new PlayGame();
		
		pg.changeCharacter();
		
		while (true) {
			pg.PrintMenu(sc);
			
			if (pg.isFlag()) {
				System.out.println("게임을 종료합니다");
				break;
			}
		}
	}
	

}
