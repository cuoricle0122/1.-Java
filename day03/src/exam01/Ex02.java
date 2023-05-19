package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num = 10;

        boolean result = ++num > 12 || (num = num +10) > 10;
        System.out.printf("num=%d%n", num); // 21
        System.out.println(result); // true
        // 단락회로평가


        int num2 = 10;

        boolean result2 = ++num < 10 && (num2 = num2 + 10) < 30;
        System.out.printf("num2=%d%n", num2); // 10
        System.out.println(result2); // false

    }
}