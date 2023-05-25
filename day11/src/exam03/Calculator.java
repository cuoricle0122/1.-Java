package exam03;

public interface Calculator {

    int NUM = 10; // 인터페이스의 모든 변수는 상수
                  // 컴파일시 기본적으로 public static final 붙음
    
    // 인터페이스 → 추상 메서드만 정의하게 되어있음
    int add(int num1, int num2); // 컴파일시 기본적으로 public abstract 붙여줌

    default int minus(int num1, int num2){ // 디폴트 붙이면 구현된 메서드 사용 가능
        int result = num1 - num2;
        return result;
    }
    
    public static void staticMethod(){
        System.out.println("정적 메서드 호출");
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }
}
