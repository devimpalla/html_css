package built_in;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatEx {

	public static void main(String[] args) {
		LocalDateTime todayNow = LocalDateTime.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String todayNowForm = df.format(todayNow);
		
		System.out.println(todayNowForm);
		
		System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));
	}

}
