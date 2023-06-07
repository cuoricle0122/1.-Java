package exam02;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex02 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        ZonedDateTime zdt1 = ldt1.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zdt1);
    }
}
