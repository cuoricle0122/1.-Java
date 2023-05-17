package exam02;

public class Ex04 {
    public static void main(String[] args) {
        byte num1 = 100; // byte 1바이트
        short num2 = num1; // short 2바이트
        int num3 = num2; // int 4바이트
        long num4 = num3; // long 8바이트
        System.out.println(num4);
        // 작은 자료형 → 큰 자료형
        // 자동으로 자료형이 변환 <자동 형변환>
        // 묵시적 형변환

        double num5 = num4; // 실수는 항상 정수보다 숫자의 표현범위가 넓다
        System.out.println(num5);
        
    }
}
