package exam01;

import java.util.Calendar;

import static java.util.Calendar.*;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int hour = cal.get(Calendar.HOUR_OF_DAY); // HOUR = 12 , HOUR_OF_DAY = 24
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.printf("%d-%d-%d %d:%d:%d%n", year, month + 1, day, hour, minute, second);
    }
}
