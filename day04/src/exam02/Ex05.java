package exam02;

public class Ex05 {
    public static void main(String[] args) {
        // 연습문제 5
        // 구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.
        System.out.println("============방법1============");
        for (int i=2; i<=9; i++){
            System.out.printf("--------%d단-------%n", i);
            for(int j=1; j<=9; j++){
                if(i <= j){
                }
                System.out.printf("%d x %d = %d%n",i,j,i*j);
            }
        }
        System.out.println("============방법2============");
        for (int i=2; i<=9; i++){
            System.out.printf("--------%d단-------%n", i);
            for(int j=1; j<=9; j++){
                if(i > j){
                    continue;
                }
                System.out.printf("%d x %d = %d%n",i,j,i*j);
            }
        }
    }
}
