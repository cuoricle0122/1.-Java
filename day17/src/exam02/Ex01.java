package exam02;

import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        double num = 100000.123;
        String pattern = "0,000.000000";
        String pattern2 = "#,###.######";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        DecimalFormat decimalFormat2 = new DecimalFormat(pattern2);
        String strNum = decimalFormat.format(num);
        System.out.println(strNum);
        String strNum2 = decimalFormat2.format(num);
        System.out.println(strNum2);

    }
}
