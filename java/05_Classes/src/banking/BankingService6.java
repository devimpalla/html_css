package banking;

import java.util.Scanner;

// 추상화
// 은행계좌정보 > BankAccount (계좌는 소유자 정보를 갖고 있지 않음, 잔액)
// 사람은 은행계좌를 갖을 수 있습니다 (이름, 현금보유액, 은행계좌)
// 사람은 은행서비스를 통해서 은행계좌를 활용한다 (입금, 출금 ...)

class BankAccount {
//	private User owner;
	private int balance;
	
	public BankAccount() {}
//	public BankAccount5(User owner) {
//		this.owner = owner;
//	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
//	public User getOwner() {
//		return owner;
//	}
	public boolean deposit(int money, User owner) {
		if (money > owner.getCashAmount()) {
			System.out.println("입금 실패!");
			System.out.println("잔고 : "+ balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return false;			
		}else {
			balance += money;
			owner.setCashAmount(owner.getCashAmount()-money);
			System.out.println(money + "입금~");
			System.out.println("잔고 : "+ balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return true;
		}
	}
	
	public boolean withdraw(int money, User owner) {
		if (money > balance) {
			System.out.println("출금 실패!");
			System.out.println("잔고 : " + balance);
			System.out.println("출금액 : " + money);
			return false;			
		} else {
			balance -= money;
			owner.setCashAmount(owner.getCashAmount()+money);
			System.out.println(money + "출금~");
			System.out.println("잔고 : "+ balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return true;
		}
	}
	
	public boolean transfer(int money, User owner1,User owner2) { // 파라미터 셋팅 필요
		if (owner1.getAccount().getBalance()<money) { // 실패조건 잔액보다 더 많은 금액을 이체할 때
			System.out.println("이체 실패!");
			System.out.println("잔고 : "+ owner1.getAccount().getBalance());
			System.out.println("출금액 : "+ money);
			return false;
		} else {
			owner1.getAccount().setBalance(owner1.getAccount().getBalance()-money);
			owner2.getAccount().setBalance(owner1.getAccount().getBalance()+money);
			printResult(money,owner1,owner2); // 파라미터를 셋팅하여 from:?, to:?, $$$ 이체완료를 출력하는 메서드
			return true;
		}
	}
	public void printResult(int money, User owner1,User owner2) {
		System.out.println("from: "+owner1.getName()+", to: "+owner2.getName()+", "+money+" 이체 완료");
	}
	
	
}

class User {
	private String name;
	private int cashAmount;
	private BankAccount account;

	public User() {}

	public User(String name, int cashAmount) {
		this.name = name;
		this.cashAmount = cashAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}
}

public class BankingService6 {
	// 은행시스템
	// 메뉴 > 1.계좌개설 2.입금 3.출금 4.이체 0.종료
	// 계좌개설 > 이름, 현금보유, 계좌객체(초기 잔액) > 초기잔액은 현금보유액과 관계가 있다!
	// 입금, 출금 > 현금 보유액과 잔액의 관계 필터링
	// 이체 > from 계좌의 잔액과 이체금액의 관계 필터링

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User me = null; // null로 초기화를 안시켜주면 조건문할때 연산을 할지 안할지 조건문이 모르기 때문에 해줘야됨
		User you= null;
		
		BankAccount myBa=null;
		BankAccount urBa=null;
		
		int menu=0;
		boolean flag = true;
		boolean isOk;
		
		
		while(flag) {
			System.out.println("\n----------뱅킹 시스템------------");
			System.out.println("메뉴 > 1.계좌개설 2.입금 3.출금 4.이체 0.종료");
			menu=sc.nextInt();
			
			switch (menu) {
			case 1:
				String[] userInfo = getUserInfo(sc);
				me = new User(userInfo[0], Integer.parseInt(userInfo[1]));
				
				String[] userInfo2 = getUserInfo(sc);
				you = new User(userInfo2[0],Integer.parseInt(userInfo2[1]));
				
				myBa = new BankAccount();
				urBa = new BankAccount();
				me.setAccount(myBa);
				you.setAccount(urBa);
				break;
			
			case 2:
				System.out.println("입금할 금액 > ");
				int saving = sc.nextInt();
				isOk = me.getAccount().deposit(saving, me);
				if(isOk) { // 구글 메세지 서버에 연결하는 부분이라고 가정하자
					System.out.print("메세지 알림: ");
					System.out.print(me.getName()+"님의 계좌로");
					System.out.print(saving + "이 입금되었습니다");
				}
				break;
			
			case 3:
				System.out.println("출금할 금액 > ");
				int withdrawl = sc.nextInt();
				isOk = me.getAccount().withdraw(withdrawl, me);
				if(isOk) { // 구글 메세지 서버에 연결하는 부분이라고 가정하자
					System.out.print("메세지 알림: ");
					System.out.print(me.getName()+"님의 계좌로");
					System.out.print(withdrawl + "이 출금되었습니다");
				}
				break;
			
			case 4:
				System.out.println("이체할 금액 > ");
				int transfer = sc.nextInt();
				isOk = me.getAccount().transfer(transfer, me, you);
				if(isOk) { 
					System.out.print("메세지 알림: ");
					System.out.print(me.getName()+"님이 "+ you.getName()+"에게");
					System.out.print(transfer + "를 송금하였습니다.");
				}
				break;
			
			default:
				flag=false;
				System.out.println("==========뱅킹시스템 종료=========");
				break;
			}
			}
			System.out.println("시스템종료");
		
	}

	private static String[] getUserInfo(Scanner sc) {
		System.out.println("예금주 명 > ");
		String name= sc.next();
		System.out.println("현금 보유액 > ");
		String money = sc.next();
		String[] infos= {name,money};
		return infos;
	}
}








