package objects;

class BankAccount2 {
	private String owner = "Park_s";
	private int accountNumber = 100200300;
	private double deposit;
	
	public BankAccount2() {
		deposit = 0.0;
	}
	
	public void saving(int money) {
		deposit = deposit + money;
		printDeposit();
	}
	
	public void withdraw(int money) {
		if (deposit < money) {
			System.out.println("잔액이 부족합니다!");
		} else {
			deposit = deposit - money;
		}
		printDeposit();
	}
	public void printDeposit() {
		System.out.println("현재 잔액 : " + deposit);	
	}
	
}

public class BankingService2 {

	public static void main(String[] args) {
		BankAccount2 myBa = new BankAccount2();
//		myBa.deposit = 1000000;
//		System.out.println(myBa.deposit);
		myBa.saving(1000000);
//		System.out.println(myBa.deposit);
		myBa.withdraw(500000);		
//		System.out.println(myBa.deposit);
	}
}
