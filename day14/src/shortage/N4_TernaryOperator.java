package shortage;

public class N4_TernaryOperator {
    public static void main(String[] args) {
        // 삼항연산자
        // 조건식 ? 표현식1 : 표현식2

        // Ex1
        int x = 10;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println("최댓값: " + max);

        // Ex2
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D";
        System.out.println("성적: " + grade);

        //
    }
}
