package exam01;

public class B extends A{
    int numB = 20;

    // 1. 생성자가 재정의 되어있지 않는 한 컴파일러가 기본 생성자를 추가해줌
    public B (){
        super(); // 2. 컴파일러가 super 추가해줌
        System.out.println("B 생성자");
    }
}
