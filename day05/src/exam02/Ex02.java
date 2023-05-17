package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int result = calc(3);
        System.out.println(result);
    }

    static int/*반환값 자료형*/ calc(int x){ // x는 매개변수

        int y = x * 2 + 1; // 실행코드 정의

        return y; // 반환값
    }
}
