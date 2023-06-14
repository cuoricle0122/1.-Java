package exam01;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,6);
        List<Integer> nums1 = Arrays.asList(1,2,3,4,5);

        // Collections.copy(nums, nums1);
        // System.out.println(nums); //[1, 2, 3, 4, 5]

        boolean result = Collections.disjoint(nums, nums1);
        System.out.println(result); // false

        List<String> alphas = Arrays.asList("A", "A", "A", "B", "C");
        int cnt = Collections.frequency(alphas,"A");
        System.out.println(cnt); // 3
    }
}
