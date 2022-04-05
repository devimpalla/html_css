package objects;

class BankAccount4 {
	private String owner;
	private int accountNumber;
	private double deposit;
	
	public BankAccount4() {
		this.deposit = 0.0;
		System.out.println("계좌가 생성되었습니다 > 현재 잔액 : " +this.deposit);
		// 여러 줄의 코드가 추가로 있다고 가정
	}	
	public BankAccount4(String owner) {
		this();
		this.owner = owner;
		// 코드가 추가로 존재한다고 가정
	}
	public BankAccount4(String owner, int accountNumber) {
		this(owner);		
		this.accountNumber = accountNumber;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void saving(int money) {
		this.deposit += money;
		printDeposit();
	}
	public void withdraw(int money) {
		if (this.deposit < money) {
			System.out.println("잔액이 부족합니다!");
		} else {
			this.deposit -= money;
		}
		printDeposit();
	}
	public void printDeposit() {
		System.out.println("현재 잔액 : " + this.deposit);	
	}
}

public class BankingService4 {

	public static void main(String[] args) {
		BankAccount4 myBa = new BankAccount4();
		myBa.setOwner("Park_s");
		myBa.setAccountNumber(122342354);
		BankAccount4 kimBa = new BankAccount4("Kim", 92199977);
		myBa.saving(1000000);
		myBa.withdraw(500000);		
	}
}
