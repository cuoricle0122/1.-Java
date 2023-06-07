package exam02;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Ex04 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.of("+9");
        OffsetDateTime offsetDateTime = localDateTime.atOffset(offset);
        System.out.println(offsetDateTime);

        ZoneOffset offset2 = ZoneOffset.of("+6");
        OffsetDateTime offsetDateTime2 = offsetDateTime.now().withOffsetSameInstant(offset2);
        System.out.println(offsetDateTime2);
    }
}
