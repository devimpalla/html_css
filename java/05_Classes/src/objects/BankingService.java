package objects;

import java.util.Scanner;

class BankAccount{
	private int balance;
	private String accountHolder;
	private int accountNumber;
	
	public BankAccount() {
		this.balance = 0;
		System.out.println("계좌가 생성되었습니다 >  현재 잔액 : "+ this.balance);
		// 여러 줄의 코드가 추가로 있다고 가정
	}
	
	public BankAccount(String accountHolder) {
		this(); // 10번 생성자 부른거
		this.accountHolder = accountHolder;
	}
	public BankAccount(String accountHolder, int accountNumber) {
		this(accountHolder); // 생성자를 부르는 방법!! 저 위에 16번 생성자 부른거임!
		// 얘네는 순차적으로 나오기 때문에 생성자 밑에 생성자를 또 쓸 수는 없음 순서를 잘 보자!
		this.accountNumber = accountNumber;
	}

	public void balanceStatus() {
		System.out.println( accountHolder+"님의 계좌의 잔액은 총 "+balance+"원 입니다.");
	}
	
	public void deposit(Scanner sc) {
		System.out.println("입금시킬 금액을 입력하세요");
		int depositMoney = sc.nextInt();
	  balance+=depositMoney;
	  System.out.println("입금이 완료되었습니다.");
	  System.out.println("현재 계좌 잔액은 "+balance+"원 입니다.");
	}
	
	public void withdraw(Scanner sc) {
		System.out.println("출금시킬 금액을 입력하세요");
		int withdrawMoney = sc.nextInt();
		if(balance < withdrawMoney) {
			System.out.println("잔액이 부족합니다.");
		}else {balance-=withdrawMoney;
		System.out.println("출금이 완료되었습니다.");
		}
		System.out.println("현재 계좌 잔액은 "+balance+"원 입니다.");
	}
		
	public int menu(Scanner sc) {
		
		System.out.println("원하시는 메뉴를 입력해 주세요");
		System.out.println("1.계좌현황 2.입금 3.출금 4.종료");
		int menu = sc.nextInt();
		return menu;
	}
	
}
public class BankingService {

	public static void main(String[] args) {
		// 계좌현황, 입금, 출금, 종료
		// 계좌 클래스는 예금주, 계좌번호, 잔액 속성을 갖는다
		// 계좌 클래스는 입금과 출금을 정상적으로 진행하는 메서드를 갖는다
		
		
		BankAccount account = new BankAccount("OwnerName",11111111); // 단축키 alt + shift + s (생성자 만드는 단축키)
		
		Scanner sc= new Scanner(System.in);
		int menu = 0;
		boolean flag = true;
		while(flag) {
			menu=account.menu(sc);
		switch (menu) {
		case 1:
			account.balanceStatus();
			break;
		case 2:
			account.deposit(sc);
			break;
		case 3:
			account.withdraw(sc);	
			break;
		case 4:
			System.out.println("은행 프로그램을 종료합니다.");
			flag = false;
			break;
		default:
			break;
		}
		}
	}

}
