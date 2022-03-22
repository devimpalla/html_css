package dataType;

public class DatyTypeEx {

	public static void main(String[] args) {
		System.out.println("기본 데이터 타입 (Primative Data Type)");
		
		System.out.println("------- 자주 사용하는 기본자료형--------");
		System.out.println("정수형 : int");
		System.out.println("int보다 큰 정수형 : long");
		System.out.println("실수형 : float,double");
		System.out.println("참거짓 : boolean");
		System.out.println("2byte 문자 : char");
		
		System.out.println("------- 드물게 사용하는 기본자료형--------");
		System.out.println("1바이트 : byte"); // -128~127
		System.out.println("2바이트 : short");// -32,768 ~ 32,767
		// 자바스크립트의 데이터 타입은 변수의 선언과 무관하다.
		// let,const =value;
		
		// 자바는 선언할 때 부터 데이터 타입을 지정해 주어야 한다!
		int num = 0; //0~4byte의 크기 정수 (음,양)
		double num2 =0.0; //0~8byte 크기 실수 (음,양)
		boolean flag = true; //또는 false => 1bit
		char ch = 'A'; //2byte의 크기 문자 => 반드시 홑 따옴표를 사용한다!!!!
		
		long longNum = 1252795284L; //리터럴 표기법 => 숫자의 정확한 타입의 표기를 위함 => 8byte
		float floatNum = 3.1415545587621658f; //리터럴 표기법 => 숫자의 정확한 타입의 표기를 위함 => 4byte
		
		String str ="원래는 참조자료형이지만 사용빈도수가 높기 때문에 기본자료형처럼 사용한다";
		String str2 = new String("원래 이렇게 써야함");
	}

}
