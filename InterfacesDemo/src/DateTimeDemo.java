import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate date = LocalDate.of(2020, 05, 30);
        System.out.println(date);

        LocalDate minus = date.minus(1, ChronoUnit.YEARS);
        System.out.println(minus);

        //January 1,2018
        //2018-01-01
        //01-01-2018    - это все дата, просто разнфй формат

        //2020-05-30 -> 30/05/2020
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy "));
        // 30/Май/2020
        String formattedDate2 = date.format(DateTimeFormatter.ofPattern("dd/LLL/yyyy ", Locale.forLanguageTag("ru")));
        String formattedDate3 = date.format(DateTimeFormatter.ofPattern("dd/LLL/yyyy ", Locale.CHINESE));
        System.out.println(formattedDate);
        System.out.println(formattedDate3);
    }
    public static Person2 fromString(String str){
        // Ivan;Ivanov;25 -> Person("Ivan", "Ivanov", 25)
        String[] m = str.split(";");
        return new Person2(m[0], m[1], Integer.valueOf(m[2]));
    }
}
