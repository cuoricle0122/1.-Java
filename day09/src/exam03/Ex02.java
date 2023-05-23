package exam03;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C();

        A a = c; // 다형성
        B b = c; // 다형성

        if (a instanceof C) {
            C c3 = (C) a;
        }

        D d = new D();

        A ad = d;
        if (ad instanceof C) {
            C c2 = (C) ad;
        }
    }
}
