package shortage;

public class N2_Operator_1 {
    public static void main(String[] args) {
        // 증감연산자

        // 증가 연산자 (++)
        // 전위 증가 연산자 (++variable): 변수의 값을 1 증가시킨 후, 증가된 값을 반환합니다.
        // 후위 증가 연산자 (variable++): 변수의 값을 1 증가시킨 후, 증가되기 이전의 값을 반환합니다.

        // 감소 연산자 (--)
        // 전위 감소 연산자 (--variable): 변수의 값을 1 감소시킨 후, 감소된 값을 반환합니다.
        // 후위 감소 연산자 (variable--): 변수의 값을 1 감소시킨 후, 감소되기 이전의 값을 반환합니다.

        int x = 5;
        System.out.println(++x); // 6
        System.out.println(x++); // 6
        System.out.println(x); // 7

        int y = 5;
        System.out.println(--y); // 4
        System.out.println(y--); // 4
        System.out.println(y); // 3

        int a = 5;
        int b = ++a;
        System.out.println(a); // 6
        System.out.println(b); // 6
        // 전위 증감 연산자는 변수 a의 값을 1 증가시킨 후, 그 값을 변수 b에 할당합니다.
        // 따라서 a와 b의 값은 모두 6이 됩니다

        int c = 5;
        int d = c++;
        System.out.println(c); // 6
        System.out.println(d); // 5
        // 후위 증감 연산자는 변수 c의 값을 변수 d에 할당한 후, c의 값을 1 증가시킵니다.
        // 따라서 c의 값은 6이 되지만, d에 할당된 값은 증가되기 이전인 5가 됩니다.

        // 즉, 전위 증감 연산자는 값이 증가되고 나서 반환되므로 증가된 값을 변수에 바로 반영합니다.
        // 후위 증감 연산자는 값이 반환되고 나서 증가되므로, 반환되는 값은 증가되기 이전의 값입니다.

    }
}
