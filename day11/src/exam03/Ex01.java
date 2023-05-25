package exam03;

public class Ex01 {
    public static void main(String[] args) {
        // SimpleCalCulator cal = new SimpleCalCulator();
        // 다형성
        Calculator cal = new SimpleCalCulator();

        int result = cal.add(10, 20);
        System.out.println(result);

        int result1 = cal.minus(20, 10);
        System.out.println(result1);

        Calculator.staticMethod();
    }

}
