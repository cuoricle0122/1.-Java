package exam01;

public class Ex08 {
    public static void main(String[] args) {
        String str = "";
        System.out.println("isEmpty : " + str.isEmpty()); // true

        String str2 = "  ";
        System.out.println("isEmpty : " + str2.isEmpty()); // false

        String str3 = "  ";
        System.out.println("isBlank : " + str3.isBlank()); // true
        System.out.println("trim().isEmpty() : " + str3.trim().isEmpty()); // true

        String str4 = "      ABC      ";
        System.out.println("trim() : " + str4.trim()); // ABC

    }
}
