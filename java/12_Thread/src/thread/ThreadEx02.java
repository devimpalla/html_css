package thread;

class Threader01 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(new String("--"));
		}
	}
	
}
class Threader02 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(new String("|"));
		}
	}
	
}

public class ThreadEx02 {
	static long startTime = 0;
	
	
	 public static void main(String[] args) {
		 Threader01 th1 = new Threader01();
		 Threader02 th2 = new Threader02();
		 
		 th1.start();
		 th2.start();
		 startTime = System.currentTimeMillis();
		 
		 try {
			th1.join(); // main 쓰레드가 th1의 작업이 끝날 때까지 기다림.
			th2.join(); // main 쓰레드가 th2의 작업이 끝날 때까지 기다림
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println(System.currentTimeMillis() - ThreadEx02.startTime);
	 }
}
