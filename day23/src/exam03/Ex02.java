package exam03;

import java.util.function.Predicate;

public class Ex02 {
    public static void main(String[] args) {
        Predicate<Integer> condition1 = x -> x >= 10;
        Predicate<Integer> condition2 = x -> x <= 100;

        Predicate<Integer> condition3 = condition1.and(condition2); // x>= 10 && x <= 100
        Predicate<Integer> condition4 = condition2.negate(); // x > 100
        boolean result1 = condition3.test(50);
        boolean result2 = condition3.test(200);
        boolean result3 = condition4.test(110);

        System.out.printf("result1=%s, result2=%s, result3=%s%n", result1, result2, result3);


    }
}
