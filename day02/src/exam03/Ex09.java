package exam03;

public class Ex09 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1--;
        System.out.printf("num1=%d,num2=%d%n", num1, num2);
        // num1=9,num2=10
        // -- 가 뒤에 있다? 대입먼저하고 연산

        int num3 = 10;
        int num4 = --num3;
        System.out.printf("num3=%d, num4=%d%n", num3, num4);
        // num3=9, num4=9
        // -- 가 앞에 있다? 연산먼저하고 대입

        int value1 = 10;
        int number1 = value1--;
        int value2 = 10;
        int number2 = --value2;
        System.out.println(number1); // 10
        System.out.println(number2); // 9
    }
}
