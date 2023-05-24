package exam01;

public class C extends B{
    int numC = 30;

    // 1. 생성자가 재정의 되어있지 않는 한 컴파일러가 기본 생성자를 추가해줌
    public C (){
        super(); // 2. 컴파일러가 super 추가해줌
        System.out.println("C 생성자");
    }
}
