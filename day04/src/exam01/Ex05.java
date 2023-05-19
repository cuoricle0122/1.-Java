package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int total = 0;
        for(int i=1; i<=100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            total += i;
            /*
            if ( i % 2 == 0 ){
                total += i;
            }
            */
        }
        System.out.printf("총합=%d%n", total);
    }
}
