package exam01;

import java.util.Optional;

public class Ex06 {
    public static void main(String[] args) {
        String str1 = "ABC";
        Optional<String> opt1 = Optional.of(str1);

        String str2 = null;
        // Optional<String> opt2 = Optional.of(str2); // NullPointerException
        Optional<String> opt3 = Optional.ofNullable(str2);
        String str3 = opt3.get();
        System.out.println(str3);

        String str4 = opt3.orElse("DEF");
        System.out.println(str4);


    }
}
