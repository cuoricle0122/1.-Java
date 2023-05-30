package shortage;

public class N2_Operator_2 {
    public static void main(String[] args) {
        // 단락회로평가 : 논리 연산자의 결과를 결정할 때, 필요한 최소한의 평가만을 수행하는 방식

        // 논리 AND 연산자 (&&):
        // 첫 번째 피연산자가 false이면, 두 번째 피연산자는 평가되지 않고 false로 결정됩니다.
        // 첫 번째 피연산자가 true이면, 두 번째 피연산자의 평가 결과에 따라 최종 결과가 결정됩니다.

        // 논리 OR 연산자 (||);
        // 첫 번째 피연산자가 true이면, 두 번째 피연산자는 평가되지 않고 true로 결정됩니다.
        // 첫 번째 피연산자가 false이면, 두 번째 피연산자의 평가 결과에 따라 최종 결과가 결정됩니다.

        // 단락 회로 평가를 사용한 AND 연산자 예시
        int a = 5;
        int b = 10;
        if (a > 0 && b++ > 0) { // a가 true 라서 b를 봐야함
            // ...
        }
        System.out.println(b); // 출력 : 11
        if (a < 0 && b++ > 0) { // a가 false 라서 b를 볼 필요도 없음
            // ...
        }
        System.out.println(b); // 출력 : 11

        // 단락 회로 평가를 사용한 OR 연산자 예시
        int c = 5;
        int d = 10;

        if (c < 0 || d++ < 0) { // c가 false이 d를 봐야함
            // ...
        }
        System.out.println(d); // 출력 : 11
        if (c > 0 || d++ < 0) { // c가 true 라서 d를 볼필요도 없음
            // ...
        }
        System.out.println(d); // 출력 : 11
    }
}
