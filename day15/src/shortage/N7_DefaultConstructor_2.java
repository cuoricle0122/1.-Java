package shortage;

public class N7_DefaultConstructor_2 {
    private String name;
    private int age;

    // 기본 생성자 - this()활용법
    public N7_DefaultConstructor_2() {
        this("이름", 31);
    }

    // 매개변수를 받는 생성자
    public N7_DefaultConstructor_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
