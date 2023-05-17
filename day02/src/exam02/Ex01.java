package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);

        num1 = 20;
        System.out.println(num1);
        
        final int num2 = 10;
        // num2 = 20; → final 상수로 변경 불가능
    }
}
