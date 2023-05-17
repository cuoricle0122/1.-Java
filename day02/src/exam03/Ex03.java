package exam03;

public class Ex03 {
    public static void main(String[] args){
        int num1 = 10;
        long num2 = 20L;

        int num6 = (int)(num1+num2);
        int num7 = num1 + (int)num2;
        long num3 = num1 + num2; // int num1 → long 으로 바뀌어야
        // 동일한 자료형 내에서만 연산이 가능
        // 큰 자료형으로 변경
        
        double num4 = 10.0; // 실수
        
        double num5 = num2 - num4; // long num2 → double 로 바뀌어야
    }
}
