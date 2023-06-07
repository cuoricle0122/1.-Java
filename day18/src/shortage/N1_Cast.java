package shortage;

public class N1_Cast {
    public static void main(String[] args) {
        long longValue = 100000000000L;

        float floatValue = 1.23123F;
        float floatValue2 = (float) 1.23123;

        // L과 F를 붙여야 하는 이유는 큰 데이터 타입을 작은 데이터 타입으로 명시적으로 변환하기 위해서
        // 데이터 손실을 피하기 위해 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 사용
    }
}
