package exam02;

public class Ex01 {
    public static void main(String[] args) {
        // Calculator cal = new Calculator();
        // int result = cal.add(10, 20);
        // System.out.println(result);

        SimpleCalculator sc = new SimpleCalculator();
        int result = sc.add(10, 20);
        System.out.println(result);

        ComplexCalculator cc = new ComplexCalculator();
        int result2 = cc.add(10, 20);
        System.out.println(result2);

        System.out.println(cc.num);
    }
}
