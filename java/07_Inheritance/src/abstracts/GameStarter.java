package abstracts;

import java.util.Scanner;

import newT.PlayGame2;

public class GameStarter {

	public static void main(String[] args) {
		
		
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
