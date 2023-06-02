package exam03;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        for (int i=0; i < 10; i++){
            double num = Math.random() * 3; // 0 , 1 , 2
            System.out.println(num);
        }

        for (int i=0; i < 20; i++){
            int num = ((int)Math.random() * 45)+1;
            System.out.println(num);
        }

    }
}
