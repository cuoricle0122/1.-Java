package exam02;

public class Ex05 {
    public static void main(String[] args) {
        try{
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; // ArithmeticException

            String str = null;
            str.toUpperCase(); // NullPointerException
        } catch (ArithmeticException e){ // 다중예외처리
            System.out.println(e.getMessage());
        } catch (NullPointerException e){ // 다중예외처리
            System.out.println(e.getMessage());
        }
    }
}

