package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Calculator cal = getCalculator();
        int result = cal.add(10, 20);
        System.out.println(result);
    }

    public static Calculator getCalculator(){
        return (a,b) -> a+b;
    }
}
