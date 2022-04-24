package list;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// ArrayList와 거의 같은 메서드를 사용함
		// List 인터페이스로부터 구현되도록 조정됨 java 1.0 부터 존재해왔었던 클래스
		// 원래는 Collection Framework가 아니었음
		// ArrayList : 싱글스레드(작동)에서 최적화 되어있고 비동기화 방식으로 작동
		// Vector : 멀티스레드에서 최적화 되어 있음 (한개의 객체를 여러작업이 동시에 사용하는 환경)
		// Vector는 동기화 방식으로 작동 > 현재는 거의 모든 작업이 싱글스레드로 진행되므로
		// Vector보다는 ArrayList를 사용할 것을 권장함
		
		List<String> list = new ArrayList<>();
		
		List<String> vector = new Vector<>();
		
		vector.add("vector1");
		
		list.add("list1");
	}

}
