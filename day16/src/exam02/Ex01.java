package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 100;

        // Integer num2 = new Integer(num1);
        // double num3 = num2.doubleValue();
        // System.out.println(num3);

        // 정리
        int num2 = 100;
        // Integer num3 = num2;
        Integer num3 = Integer.valueOf(num2);

        int num4 = num2 + num3.intValue();
        System.out.println(num4);

    }
}
