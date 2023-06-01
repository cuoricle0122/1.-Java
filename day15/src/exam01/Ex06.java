package exam01;

public class Ex06 {
    public static void main(String[] args) {
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        System.out.println(str1 == str2); // false - 동일성 비교 - 같은 객체 X
        System.out.println("str1 : " + System.identityHashCode(str1)); // str1 : 1915910607
        System.out.println("str2 : " + System.identityHashCode(str2)); // str2 : 1389133897
        System.out.println(str1.equals(str2)); // true - 동등성 비교 - 값은 값이면 동등하게 처리

    }
}
