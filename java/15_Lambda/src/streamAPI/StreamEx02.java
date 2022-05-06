package streamAPI;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx02 {

	public static void main(String[] args) {
		Stream<Double> dbStream = Stream.of(5.1,4.7,3.9,6.2,1.4,7.8);
		dbStream.forEach(System.out::println); // 가변변수 처리 후 출력
		
		IntStream intStream = IntStream.range(1, 46);
		intStream.forEach((n) -> {System.out.println(n%2==0);});
		
		// 랜덤 추출
		IntStream randomStream = new Random().ints(6);
		randomStream.forEach(System.out::println);
	}

}
