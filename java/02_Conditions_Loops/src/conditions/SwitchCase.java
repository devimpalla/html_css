package conditions;

public class SwitchCase {

	public static void main(String[] args) {
		// 비교연산 => 정확하게 일치하는 값이 필요함
		String str = "Spring";
		
		switch (str) {
		case "Spring":
			System.out.println("봄이로구나~");
			break;
		case "Summer":
			System.out.println("여름이로구나~");
			break;
		case "Autumn":
				System.out.println("가을이로구나~");
				break;
		case "Winter":
				System.out.println("겨울이로구나~");
				break;
		default:
			System.out.println("어디서 오심?");
			break;
		}
	}

}
