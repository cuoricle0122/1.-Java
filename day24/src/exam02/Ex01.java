package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> fruits1 = Arrays.asList("Melon", "Banana", "Apple", "Orange");
        fruits1.stream().sorted();
        String[] fruits = {"Melon", "Banana", "Apple", "Orange"};
    }
}
