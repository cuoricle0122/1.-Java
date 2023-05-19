package exam03;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 == num2); // false
        System.out.println(num1 != num2); // true
        System.out.println(num1 < num2); // true
        System.out.println(num1 <= num2); // true
        System.out.println(num1 > num2); // false
        System.out.println(num1 >= num2); // false

        boolean result = num1 > num2; // true or false
        System.out.println(result);


    }
}
