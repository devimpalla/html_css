package objects;

import java.util.Scanner;

class NumberBaseball{
	int[] comNum = {0,0,0};
	int[] myNum = new int[4];
	int[] strikeAndBall= new int[3];
	String myNumStr = "";
	
	public int[] makeRandomNumberOfComputer() {
		
		for (int i = 0; i < comNum.length; i++) {
			comNum[i]= (int)(Math.random()*9)+1;
			
			for (int j = 0; j < i; j++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i : comNum) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n컴퓨터가 숫자를 정하였습니다!");
		return comNum;
	}
	
	public int[] guessNumberOfMine(Scanner sc) {
		
		System.out.println("숫자를 추측하세요 > 예) 123");
		myNumStr = sc.next();
		String[] myNumArr = myNumStr.split("");
		for (int i = 0; i < myNumArr.length; i++) {
			myNum[i] = Integer.parseInt(myNumArr[i]);
		}
		myNum[myNum.length-1]=Integer.parseInt(myNumStr);
		return myNum;
	}
	
	public int[] compareNumbers() {
		strikeAndBall= new int[3]; // 반복문 돌때마다 초기화
		
		for (int i = 0; i < comNum.length; i++) {
			for (int j = 0; j < myNum.length; j++) {
				if(comNum[i]==myNum[j] && i==j) {
					strikeAndBall[0]++;
				}else if(comNum[i]==myNum[j] && i!=j) {
					strikeAndBall[1]++;
				}
			}
		}
		strikeAndBall[2] = 1;
		return strikeAndBall;
	}
	public boolean printResult(int count) {
		System.out.println(count + "회 시도: " + myNumStr);
		System.out.print(" > "+ strikeAndBall[0] + "S " + strikeAndBall[1] + "B\n");
		
		if(strikeAndBall[0]==3) {
			System.out.println("게임 종료!");
			return false;
		}
		return true;
	}
}
public class Quiz03 {

	public static void main(String[] args) {
		// 숫자 야구 게임
		
		NumberBaseball nb = new NumberBaseball();
		Scanner sc = new Scanner(System.in);
		
		
		int count=0;
		
		int[] comNum = nb.makeRandomNumberOfComputer();
		
		boolean flag = true;
		
		while (flag) {
			int[] myNum = nb.guessNumberOfMine(sc);
			
			int[] strikeAndBall = nb.compareNumbers();
			count += strikeAndBall[2];
			
			flag = nb.printResult(count);
		}
		System.out.println("야구 게임 종료!");
	}

}
