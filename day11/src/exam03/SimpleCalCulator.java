package exam03;

public class SimpleCalCulator implements Calculator{

    // 접근제어자로 public 만 올 수 있다
    // → 인터페이스에 정의된 메서드는 컴파일시 기본적으로 public abstract 붙여줌
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
