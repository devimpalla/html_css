package objects;

class BankAccount3 {
	private String owner;
	private int accountNumber;
	private double deposit;
	
	public BankAccount3() {
		this.deposit = 0.0;		
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

public class BankingService3 {

	public static void main(String[] args) {
		BankAccount3 myBa = new BankAccount3();
		myBa.setOwner("Park_s");
		myBa.setAccountNumber(122342354);
//		BankAccount3 kimBa = new BankAccount3("Kim", 9210599977);
		myBa.saving(1000000);
		myBa.withdraw(500000);		
	}
}
