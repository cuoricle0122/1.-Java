package exam01;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("length() : " + str.length()); // length() : 3

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars)); // [A, B, C]
        System.out.println("toLowerCase() : " + str.toLowerCase()); // toLowerCase() : abc
        System.out.println("toUpperCase() : " + str.toUpperCase()); // toUpperCase() : ABC
        System.out.println("replace() : " + str.replace("ABC","abc")); // replace() : abc
        System.out.println("substring(2) : " + str.substring(2));
        System.out.println("substring(2, 4) : " + str.substring(2, 3)); //

    }
}
