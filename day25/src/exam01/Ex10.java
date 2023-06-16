package exam01;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7, 9, 11};
        boolean matched1 = Arrays.stream(nums1).allMatch(n -> n % 2 == 1);
        System.out.println(matched1); // 모두 일치 > true

        int[] nums2 = {1, 3, 5, 7, 9, 12};
        boolean matched2 = Arrays.stream(nums2).allMatch(n -> n % 2 == 1);
        System.out.println(matched2); // 모두 일치 > false

        boolean _matched2 = false;
        for(int num : nums2) {
            if(num % 2 == 1){
                matched2 = true;
                break;
            }
        }
        System.out.println(_matched2); // 모두 일치 > false

        int[] nums3 = {1, 2, 4, 6, 8, 10};
        boolean matched3 = Arrays.stream(nums3).anyMatch(n -> n % 2== 1);
        System.out.println(matched3); // 부분 일치 > true

        int[] nums4 = {2, 4, 6, 8, 10};
        boolean matched4 = Arrays.stream(nums4).noneMatch(n -> n % 2 == 1);
        System.out.println(matched4); // 모두 불일치 > true

        Random rand = new Random();
        int r = rand.ints().filter(n->n%2==1).findFirst().getAsInt();
        System.out.println(r);
    }
}
