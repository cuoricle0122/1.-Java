package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int result1 = add(10, 20, 30);
        int result2 = add(10, 20);
        System.out.printf("result1 = %d%n", result1);
        System.out.printf("result2 = %d%n", result2);
    }

    public static int add(int... nums){
        int total = 0;
        for (int num : nums){
            total += num;
        }
        return total;
    }
}
