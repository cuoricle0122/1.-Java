package exam02;

public class Ex08 {
    public static void main(String[] args) {
        int result = add(10, 20.354);
        int result2 = add(10.23F, 10);

    }

    public static int add(Number num1, Number num2){ // 어떤 숫자가 올지 모를때 Number사용할 것
            int result = num1.intValue() + num2.intValue();
        return result;
    }
}
