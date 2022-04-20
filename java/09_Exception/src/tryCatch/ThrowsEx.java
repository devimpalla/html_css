package tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsEx {

	public static void main(String[] args) throws IOException {
		// throws 방식은 같은종류의 예외를 일정한 영역에서 발생할 것이라고 예측될 때 사용을 권장
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name = br.readLine();
		
		br.close();

	}

}
