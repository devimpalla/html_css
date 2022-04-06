package objects;
class Pet{
	public int number=0; // public 쓰면 다른 패키지에서도 사용가능!
	String nickName="냥이";
	boolean gender = true;
	int age= 2;
	char kind='A';
	public Pet() {
		
	}
	
	void move() {
		System.out.println("어 움직인다!");
	}
	void sound() {
		System.out.println("야옹야옹");
	}
	void getOld() {
		age++;
	}
}

public class Person {

	public static void main(String[] args) {
		Pet myCat = new Pet();
		String myCatNick = myCat.nickName;
		System.out.println(myCatNick);
		System.out.println(myCat.nickName);
		myCat.nickName = "냥냥이";
		
		

	}

}
