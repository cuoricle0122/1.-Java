package exam03;

import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        IntStream stm1 = IntStream.rangeClosed(1, 50);
        IntStream stm2 = IntStream.rangeClosed(1, 50);

        IntStream stm3 = IntStream.concat(stm1, stm2);
        int total = stm3.sum();
        System.out.println(total);
    }
}
