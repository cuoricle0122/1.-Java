package test;

import java.util.Arrays;
import java.util.Collections;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 10, 7, 9, 11};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};

        // 배열 오름차순
        System.out.println("====배열 오름차순====");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // 배열 내림차순
        System.out.println("====배열 내림차순====");
        Integer arr4[] = {1, 3, 10, 7, 9, 11};
        Arrays.sort(arr4, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr4));

        // 배열 복사
        System.out.println("====배열 복사====");
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr3));

        // 1차원 배열 출력
        System.out.println("====1차원 배열 출력====");
        System.out.println(Arrays.toString(arr1));

        // 다차원 배열 출력 관련
        System.out.println("====다차원 배열 출력====");
        System.out.println(Arrays.deepToString(arr2));
        System.out.println("행의 갯수 : " + arr2.length);
        System.out.println("0행의 열의 갯수 : " + arr2[0].length);
        System.out.println("1행의 열의 갯수 : " + arr2[1].length);
    }
}
