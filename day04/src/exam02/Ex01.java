package exam02;

public class Ex01 {
    public static void main(String[] args) {
        // 연습문제 1
        // 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
        int x = 20;
        double y = 3.0;
        int sum = x + (int)y;
        int minus = x - (int)y;
        int divide = x / (int)y;
        int multi = x * (int)y;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(divide);
        System.out.println(multi);
    }
}
