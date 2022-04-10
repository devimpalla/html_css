package built_in;

import java.time.LocalDateTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		LocalDateTime todayNow = LocalDateTime.now();
		System.out.println(todayNow); // 가운데 T가 존재
		
		System.out.println(todayNow.getDayOfMonth());
		
		// 메서드는 LocalDate, LocalTime에 있는 메서드를 모두 포함
		System.out.println(todayNow.getDayOfMonth());
		System.out.print(todayNow.getYear() + "-");
		System.out.print(todayNow.getMonthValue() + "-");
		System.out.print(todayNow.getDayOfMonth() + " ");
		System.out.print(todayNow.getHour() + ":");
		System.out.print(todayNow.getMinute() + ":");
		System.out.println(todayNow.getSecond());
	}

}
