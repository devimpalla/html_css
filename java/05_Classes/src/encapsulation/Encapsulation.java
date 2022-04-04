package encapsulation;

class SnivelCapsule{
	public void take() {
		System.out.println("콧물이 싹 낫습니다");
	}
}

class SneezeCapsule{
	public void take() {
		System.out.println("재채기가 싹 낫습니다");
	}
}

class SnuffleCapsule{
	public void take() {
		System.out.println("코막힘이 싹 낫습니다");
	}
}

class Contac600{
	SnivelCapsule sni;
	SneezeCapsule snz;
	SnuffleCapsule snf;
	public Contac600() {
		sni = new SnivelCapsule();
		snz = new SneezeCapsule();
		snf = new SnuffleCapsule();
	}
	public void take() {
		sni.take();
		snz.take();
		snf.take();
	}
}
class ColdPatient{
	public void take(Contac600 contac600) {
		contac600.take();
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		ColdPatient sufferer = new ColdPatient();
		Contac600 contac600 = new Contac600();
		sufferer.take(contac600);

	}

}
