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
        
        // 2차원 배열 출력하기
        System.out.println(Arrays.deepToString(arrays2));

        // 배열 오름차순
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays)); // [1, 2, 3, 4, 5]

        // 배열 내림차순
        // Arrays.sort(arrays, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arrays));

        // 배열 복사

        // 1차원 배열 출력

        // 다차원 배열 출력 관련

    }
}
