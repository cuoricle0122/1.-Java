package shortage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class N5_ArrayIntensification {
    public static void main(String[] args) {
        // int[] arrays = new int[5];
        int[] arrays = {3, 2, 1, 5, 4};
        int[][] arrays2 = {{2, 1, 3}, {5, 4, 6}};

        // 1차원 배열 출력하기
        System.out.println(Arrays.toString(arrays));
        
        // 다차원 배열 출력하기
        System.out.println(Arrays.deepToString(arrays2));
        System.out.println("행의 갯수 : " + arrays2.length); // 행의 갯수 : 2
        System.out.println("0행의 열의 갯수 : " + arrays2[0].length); // 0행의 열의 갯수 : 3
        System.out.println("1행의 열의 갯수 : " + arrays2[1].length); // 1행의 열의 갯수 : 3
        // 배열 오름차순
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays)); // [1, 2, 3, 4, 5]

        // 배열 내림차순
        // Arrays.sort(arrays, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arrays));

        // 배열 복사
        int[] arrays3 = Arrays.copyOf(arrays, arrays.length);
        System.out.println(Arrays.toString(arrays3)); // [1, 2, 3, 4, 5]
    }
}
