package exam02;

public class Ex04 {
    public static void main(String[] args) {
        // 연습문제 4
        // 구구단을 홀수 단만 출력하도록 프로그램을 만드시오.
        System.out.println("============방법1============");
        for (int i=2; i<=9; i++){
            if (i % 2 == 1){
                System.out.printf("--------%d단-------%n", i);
            }
            for(int j=1; j<=9; j++){
                System.out.printf("%d x %d = %d%n",i,j,i*j);
            }
        }
        System.out.println("============방법2============");
        for (int k=2; k<=9; k++){
            if (k % 2 == 0){
                continue;
            }
            System.out.printf("--------%d단-------%n", k);
            for(int l=1; l<=9; l++){
                System.out.printf("%d x %d = %d%n",k,l,k*l);
            }
        }
    }
}
