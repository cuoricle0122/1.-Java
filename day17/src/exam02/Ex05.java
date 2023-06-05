package exam02;

import java.text.ChoiceFormat;

public class Ex05 {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};

        int[] scores = {90, 95, 52, 62, 75, 85};
        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for (int score : scores){
            System.out.printf("점수 : %d, 학점 : %s%n", score, form.format(score));
        }

        System.out.println("==========================================================");

        String pattern = "60#D|70#C|80<B|90#A";
        int[] scores2 = {90, 95, 52, 62, 75, 85};
        ChoiceFormat form2 = new ChoiceFormat(pattern);

        for (int score : scores){
            System.out.printf("점수 : %d, 학점 : %s%n", score, form.format(score));
        }


    }
}
