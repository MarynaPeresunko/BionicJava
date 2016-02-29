// How old are you in days and months?
// What day of week is your birthday?

import java.time.*;
import java.time.temporal.*;

public class Age {

	public static void main(String[] args) {
		LocalDate current = LocalDate.now();
		LocalDate bday = LocalDate.of(1991, 5, 3);
		
		long days = bday.until(current, ChronoUnit.DAYS);
		long monthsOld = bday.until(current, ChronoUnit.MONTHS);
		
		System.out.println(days + " — days old");
		System.out.println(monthsOld + " — months old");
		
		DayOfWeek bWeekDay = bday.getDayOfWeek();
		System.out.println(bWeekDay.toString() + "— the day of birth");
	}

}