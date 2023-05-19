package exam03;

public class Ex11 {
    public static void main(String[] args){
        boolean result1 = true && true; // true
        boolean result2 = false && false; // false
        System.out.println(result1);
        System.out.println(result2);

        boolean result3 = true || true; // true
        boolean result4 = true || false; // true
        boolean result5 = false || false; // false
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
