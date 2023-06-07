package exam01;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex08 {
    public static void main(String[] args) {
        // LocalDate의 기본객체는 변경 불가, 새로운 객체 생성하여 대입

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalDate date2 = date1.with(ChronoField.YEAR, 2022);
        System.out.println(date2);

        LocalDate date3 = date1.withYear(2022);
        System.out.println(date3);
    }
}
