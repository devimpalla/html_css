package thread;

class Threadable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}

class Threader extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx01 {

	public static void main(String[] args) {
		Threader t1 = new Threader();
		Runnable t2 = new Threadable();
		Thread t3 = new Thread(t2);
		
		t1.start();
		t3.start();
	}

}
