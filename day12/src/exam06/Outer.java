package exam06;

public class Outer {

    int num1 = 30;

    class Inner { // 인스턴스 내부 클래스
        int num1 = 20;
        void printNum(){
            System.out.println(this.num1); // 내부클래스의 num1을 사용하는 방법
            System.out.println(Outer.this.num1); // 외부클래스의 num1을 사용하는 방법
        }
        static int num = 100;
        static void method(){
            System.out.println("정적메서드!");
        }
    }
}
