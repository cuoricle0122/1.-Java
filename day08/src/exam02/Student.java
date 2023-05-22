package exam02;

public class Student {
    static int id; // 정적인 변수 → 스태틱 변수 → 클래스 변수
    String name; // 인스턴스 변수
    String subject; // 인스턴스 변수

    void showInfo(){
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
        // id, name, subject는 this가 생략 되어있을뿐
    }

    static void staticMethod(){ // 정적 메서드
        System.out.println("정적 메서드");
    }

}
