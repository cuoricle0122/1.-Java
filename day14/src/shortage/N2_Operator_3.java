package shortage;

public class N2_Operator_3 {
    public static void main(String[] args) {
        // 복합대입연산자

        // 덧셈 복합 대입 연산자 (+=): 변수에 값을 더한 후, 그 결과를 변수에 할당합니다.
        // 뺄셈 복합 대입 연산자 (-=): 변수에서 값을 뺀 후, 그 결과를 변수에 할당합니다.
        // 곱셈 복합 대입 연산자 (*=): 변수에 값을 곱한 후, 그 결과를 변수에 할당합니다.
        // 나눗셈 복합 대입 연산자 (/=): 변수를 값으로 나눈 후, 그 결과를 변수에 할당합니다.
        // 나머지 복합 대입 연산자 (%=): 변수를 값으로 나눈 나머지를 구한 후, 그 결과를 변수에 할당합니다.

        int a = 10;
        a += 5;   // a = a + 5;
        System.out.println(a);  // 출력: 15

        int b = 20;
        b -= 3;   // b = b - 3;
        System.out.println(b);  // 출력: 17

        int c = 4;
        c *= 2;   // c = c * 2;
        System.out.println(c);  // 출력: 8

        int d = 15;
        d /= 6;   // d = d / 6;
        System.out.println(d);  // 출력: 2

        int e = 7;
        e %= 4;   // e = e % 4;
        System.out.println(e);  // 출력: 3

    }
}
