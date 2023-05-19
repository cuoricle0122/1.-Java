package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num = 15;
        if (num == 10) {
            System.out.println("10이다!");
        } else {
            System.out.println("10이 아니다!");
        }

        String result = num == 15 ? "15이다!" : "15가 아니다!";
        System.out.println(result);
    }
}
