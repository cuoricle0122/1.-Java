package shortage;

public class N5_Array {
    public static void main(String[] args) {
        // 배열선언
        int[] arrayNum;

        // 배열초기화
        arrayNum = new int[3];

        // 선언과 동시에 초기화
        int[] arrayNum2 = new int[3];

        // 요약
        int[] numbers;
        numbers = new int[5];
        int[] numbers2 = new int[5];
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;

        // 다양한 배열 선언과 초기화
        int[] array1 = new int[5];
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 5};

        // 배열 값 일기
        int value = numbers2[3];
        System.out.println(value); // 40

        // 배열의 길이
        int length = numbers2.length;
        System.out.println(length); // 5

        // 배열의 순회
        for(int i=0; i< numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
        for(int number : numbers2){
            System.out.println(number);
        }
    }
}
