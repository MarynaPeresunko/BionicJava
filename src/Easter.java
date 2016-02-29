import java.time.*;
import java.time.format.DateTimeFormatter;

public class Easter {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
      
        for ( int year = 2011; year < 2021; year++ ) {
           
            LocalDate easter = Easter(year);
            String EasterDate = easter.format(formatter);
            String DayOfWeek = easter.getDayOfWeek().toString();
            
            System.out.println(EasterDate + " (" + DayOfWeek + ")"); 
        }
    }

        static LocalDate Easter(int year) {
            int a = year % 19;
            int b = year % 4;
            int c = year % 7;
            int d = (19 * a + 15) % 30;
            int e = (2 * b + 4 * c + 6 * d + 6) % 7;
            int f = d + e;
            
         if ( f <= 9 ) {
                return LocalDate.of(year, 3, 22+f).plusDays(13);
            } else {
                return LocalDate.of(year, 4, f-9).plusDays(13);
                }
            }
        }
