package overloading;

public class CalcArea {

	public static void main(String[] args) {
		int width =100;
		int height =40;
		squarsArea(width,height);
		triangleArea(width, height);
		double r = 2.5;
		circleArea(r);
	}

	private static void circleArea(double r) {
		double pi = Math.PI;
		System.out.println("원의 넓이: "+r*r*pi);
		
	}

	private static void triangleArea(int width, int height) {
		System.out.println("삼각형의 넓이: "+ (width*height)/2);
		
	}

	private static void squarsArea(int width, int height) {
		System.out.println("사각형의 넓이: " + width*height);
	}

}
