package exam03;

public class Ex08 {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = num1++;
        System.out.printf("num1=%d, num2=%d%n", num1, num2);
        // num1=12, num2=11
        // ++ 뒤에있다? 대입부터 먼저하고 연산

        int num3 = 11;
        int num4 = ++num3;
        System.out.printf("num3=%d, num4=%d%n", num3, num4);
        // num3=12, num4=12
        // ++ 앞에있다? 연산부터 먼저

        int value1 = 10;
        int number1 = value1++;
        int value2 = 10;
        int number2 = ++value2;
        System.out.println(number1); // 10
        System.out.println(number2); // 11
    }
}
