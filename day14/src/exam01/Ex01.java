package exam01;

public class Ex01 {
    public static void main(String[] args) {
        try {
            int num1 = 100;
            int num2 = 0;

            int result = num1 / num2;
            System.out.println(result); // throw new ArithmeticException 발생 // by zero

        } catch (ArithmeticException e){
            // System.out.println("예외처리 ...");
            // String message = e.getMessage();
            // System.out.println(message);
            e.printStackTrace();
        }
        System.out.println("매우 중요한 실행 코드");

    }
}
