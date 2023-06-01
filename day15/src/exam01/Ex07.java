package exam01;

public class Ex07 {
    public static void main(String[] args) {
        String str1 = "ABC"; // 문자열 상수
        String str2 = "ABC";
        System.out.println(str1 == str2); // true
        System.out.println("str1 : " + System.identityHashCode(str1)); // str1 : 1915910607
        System.out.println("str2 : " + System.identityHashCode(str2)); // str2 : 1915910607


    }
}
