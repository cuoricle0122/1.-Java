package exam04;

import java.util.Arrays;
import java.util.Collection;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 10, 7, 9, 11};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //Arrays.sort(arr1, Collection.reverseOrder());


    }
}
