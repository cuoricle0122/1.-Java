package exam01;

public class Ex01 {
    public static void main(String[] args) {
        int num = 1, total = 0;
        while(num <= 100) {
            total += num;
            num++; // ← 해당 증감식이 없다면 계속 반복되기때문에 넣어줌
        }
        System.out.printf("총합=%d%n", total);
    }
}
