package exam03;

public class Ex03 {
    public static void main(String[] args) {

        int num = 1, total = 0;
        do {
            // total = total + num;
            total += num;
            num++;
        } while (num <= 100);
        System.out.printf("총합=%d%n", total);
        
        // int num - 초기값 , num <= 100 - 조건식, num++ - 증가식
    }
}
