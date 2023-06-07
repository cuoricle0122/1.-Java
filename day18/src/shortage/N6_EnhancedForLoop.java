package shortage;

import java.util.ArrayList;
import java.util.List;

public class N6_EnhancedForLoop {
    public static void main(String[] args) {
        // 향상된 for문
        // for (변수타입 변수명 : 배열 또는 컬렉션) {
            // 반복 실행할 코드
        // }

        // Ex1
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        // Ex2
        int[] numbers2 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers2) {
            sum += number;
            // sum = sum + number;
        }
        System.out.println("배열의 합: " + sum);

        // Ex3 - 컬렉션 프레임워크에서의 향상된for문
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
