package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> fruits1 = Arrays.asList("Banana", "Orange", "Apple", "Melon");
        // fruits1.stream().sorted().forEach(s -> System.out.println(s));
        fruits1.stream().sorted().forEach(System.out::println);

        String[] fruits2 = {"Banana", "Orange", "Apple", "Melon"};
        Arrays.stream(fruits2);

        for(String fruit:fruits2){
            System.out.println(fruit);
        }
    }
}
