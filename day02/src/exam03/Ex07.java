package exam03;

public class Ex07 {
    public static void main(String[] args){
        int num1 = 10;
        num1 = num1 + 1;
        System.out.println(num1);
        num1++;
        System.out.println(num1);

        int num2 = 10;
        int num3 = num2++;
        System.out.println(num2); // 11
        System.out.println(num3); // 10

        int num4 = 10;
        int num5 = ++num4;
        System.out.println(num4); // 11
        System.out.println(num5); // 11
    }
}
