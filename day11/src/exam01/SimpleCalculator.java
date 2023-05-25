package exam01;

public class SimpleCalculator extends Calculator{

    int num = 10;

    @Override
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Override
    public int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
}
