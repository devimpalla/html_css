package basic;

public class Cooling {

	public static void main(String[] args) {
		// 냉장고를 제작하기 위한 시작점
		
		Electronic elec = new Dimchae();
	      System.out.println(elec.getButton());
	      
	      Electronic cooler = new Dimchae();
	      Electronic freezer = new Dimchae();
	      
	      Electronic kimchi = new Dimchae();
	      System.out.println(kimchi.isPower());
	      
	      kimchi.setButton(3);
	      System.out.println(kimchi.getButton());
	      // 18번 라인까지는 상속을 통한 다형성 구현, 다형성을 통한 상속으로 입증되는 리소스 검증
	      
	      Electronic dim1 = new Dimchae();
	      System.out.println(dim1.getButton());
	      
	      KimchiRef dim2 = new Dimchae();
	      Freezer dim3 = new Dimchae();
	      
	      Cooler dim4 = new Dimchae();
	      System.out.println(dim4.isPower());
	      
	      dim4.setButton(3);
	      System.out.println(dim4.getButton());
	      // 31번 라인까지는 추상클래스를 활용한 느슨한 연결을 상속을 통해서 구현
	      // 추상클래스는 객체로 인스턴스를 만들 수가 없기 때문에 구현 되었을때 문제가 되는 위험은 줄어듬
	      // 테스트용 객체를 여러 개념이 도입된 방식을 만들 때 편하게 사용할 수 있음
		
		
	}

}
