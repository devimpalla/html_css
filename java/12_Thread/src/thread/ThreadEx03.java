package thread;

class Account{
	private int balance = 1000;
	
	public int getBalance() {
		return this.balance;
	}

	public synchronized void withdraw(int money) throws InterruptedException {
		if(balance >= money) {
			Thread.sleep(1000);
			balance-=money;
		}
		
	}
	
}

class Threadable01 implements Runnable{
	Account account = new Account();
	
	@Override
	public void run() {
		while(account.getBalance() > 0) {
			int money = ((int)(Math.random() * 5)+1)*10;
			try {
				account.withdraw(money);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">>> balance > "+ account.getBalance());
		}
	}
	
}

public class ThreadEx03 {

	public static void main(String[] args) {
		Runnable r = new Threadable01();
		
		new Thread(r).start();
		new Thread(r).start();
	}

}
