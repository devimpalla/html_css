package built_in;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now); // 밀리세컨으로 나옴
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		System.out.println(now.toNanoOfDay());
		System.out.println(now.toSecondOfDay());
		System.out.println(now.toString());
		System.out.println(now.MAX);
		System.out.println(now.MIN);
		System.out.println(now.MIDNIGHT);
		System.out.println(now.plusHours(1L));
		System.out.println(now.plusMinutes(1L));
		System.out.println(now.plusSeconds(10L));
		System.out.println(now.plusNanos(10000L));

	}

}
