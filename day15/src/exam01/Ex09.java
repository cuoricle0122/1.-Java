package exam01;

import java.util.HashSet;

public class Ex09 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("ABC");
        names.add(new String("ABC"));
        names.add("DEF");
        names.add(new String("DEF"));
        names.add("GHI");
        names.add(new String("GHI"));

        System.out.println(names); // [ABC, DEF, GHI]

    }
}
