package recursion;

public class RecursiveMethod {

	public static void main(String[] args) {
		int sum = recursion(10);

	}

	private static int recursion(int i) {
		if(i > 0) {
			return i + recursion(i-1);
		}else {
			return 0;
		}
	}

}
