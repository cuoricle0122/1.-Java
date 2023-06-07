package exam01;

import java.util.Calendar;

import java.util.Calendar;
import static java.util.Calendar.*;

public class Ex01_2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(HOUR_OF_DAY, 6); // 6시간 뒤
        cal.add(HOUR_OF_DAY, -6); // 6시간 전
        showDate(cal);
    }

    private static void showDate(Calendar cal){
        int year = cal.get(YEAR);
        int month = cal.get(MONTH);
        int day = cal.get(DAY_OF_MONTH);

        int hour = cal.get(HOUR_OF_DAY); // HOUR = 12 , HOUR_OF_DAY = 24
        int minute = cal.get(MINUTE);
        int second = cal.get(SECOND);

        System.out.printf("%d-%d-%d %d:%d:%d%n", year, month + 1, day, hour, minute, second);
    }
}

