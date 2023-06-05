package exam02;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex02 {
    public static void main(String[] args) throws ParseException {
        String strNum = "1,000,000,000";
        String pattern = "#,###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        Number number = decimalFormat.parse(strNum);
        long num = number.longValue();
        System.out.println(num);
    }
}
