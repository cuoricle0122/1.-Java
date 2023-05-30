package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // Outer outer = new Outer();
        // Outer.method();

        Outer2 outer = new Outer2();
        Calculator cal = outer.method();
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
