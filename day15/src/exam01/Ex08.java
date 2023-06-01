package exam01;

public class Ex08 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");
        boolean result = isSame1(str1, str2);
        System.out.println(result); // 동일성비교 // true → 같은 값, 문자열상수로 같은 주소
        boolean result2 = isSame1(str1, str3);
        System.out.println(result2); // 동일성비교 // false → 같은 값, 다른 주소
        boolean result3 = isSame2(str1, str2);
        System.out.println(result3); // 동등성비교 // true → 같은 값
        boolean result4 = isSame2(str1, str3);
        System.out.println(result4); // 동등성비교 // ture → 같은 값
    }
    public static boolean isSame1(String str1, String str2){ return str1 == str2; }
    public static boolean isSame2(String str1, String str2){ return str1.equals(str2); }
}
