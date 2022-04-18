package dbservice;

public class WebApplication {

	public static void main(String[] args) {
		Service svc = new WebService(); // 서비스라는 인터페이스 규격에 따른 웹서비스를 만들겠다
		svc.read();
		
		Service svc2 = new WebService();
		svc2.create();
	}

}
