package exam01;

public class Ex01 {
    public static void main(String[] args) {
        boolean result1 = true && true;
        boolean result2 = false && false;

        System.out.printf("result1=%s%n", result1); // true
        System.out.printf("result2=%s%n", result2); // false

        boolean result3 = false && true;
        boolean result4 = true && false;

        System.out.printf("result3=%s%n", result3); // false
        System.out.printf("result4=%s%n", result4); // false

        int num = 15;
        // num가 10이상 100이하 수인지 체크
        boolean result5 = num >= 10;
        boolean result6 = num <= 100;
        boolean result7 = result5 && result6;
        boolean result8 = num >= 10 && num <= 100;
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
    }
}
