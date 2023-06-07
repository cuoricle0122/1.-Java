package exam01;

import java.time.LocalDate;
import static java.time.temporal.ChronoField.*;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        int year = date1.get(YEAR);
        int month = date1.get(MONTH_OF_YEAR);
        int day = date1.get(DAY_OF_MONTH);
        System.out.printf("%d-%d-%d%n", year, month, day);

        int year1 = date1.getYear();
        int month1 = date1.getMonthValue();
        int day1 = date1.getDayOfMonth();
        System.out.printf("%d-%d-%d%n", year1, month1, day1);
    }
}
