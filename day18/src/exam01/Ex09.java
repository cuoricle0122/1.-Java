package exam01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex09 {
    public static void main(String[] args) {
        // LocalDate의 기본객체는 변경 불가, 새로운 객체 생성하여 대입
        LocalDate date1 = LocalDate.now();

        LocalDate date2 = date1.plus(100, ChronoUnit.DAYS); // plus → 100일 앞
        System.out.println(date2);
        LocalDate date3 = date1.plusDays(100); // 요약형식
        System.out.println(date3);

        LocalDate date4 = date1.minus(100, ChronoUnit.DAYS); // minus → 100일 전
        System.out.println(date4);
        LocalDate date5 = date1.minusDays(100); // 요약형식
        System.out.println(date5);
    }
}
