package exam02;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C();
        A a = c; // A객체의 내용의 C객체의 자원 → 양만 A클래스 정의 범위로 한정
        B b = c;
        // C객체가 포함하고 있는 B, A 객체로 자료형이 변경 → 다형성
    }
}
