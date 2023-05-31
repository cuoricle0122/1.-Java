package exam01;

public class Ex02 {
    public static void main(String[] args) {
        try {
            int num1 = 100;
            int num2 = 2;

            int result = num1 / num2;
            System.out.println(result); // throw new ArithmeticException(...) 발생

            String str = null;
            str.toUpperCase(); // throw new NullPointerException(...) 발생
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
