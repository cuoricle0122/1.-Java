package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int total = 0;
        for (int num=1; num<=100; num++){
            total += num;
        }
        System.out.printf("총합=%d%n", total);

        int total2 = 0, total3 = 0;
        for (int i=1, j=100; i <=100; i++, j--){
            total2 += i;
            total3 += j;
        }
        System.out.printf("총합1=%d, 총합2=%d%n", total2, total3);
    }
}
