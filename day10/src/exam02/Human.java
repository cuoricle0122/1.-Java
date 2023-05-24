package exam02;

public class Human extends Animal {
    public void readBook(){
        System.out.println("독서를 한다");
    }
    @Override
    public void move() {
        System.out.println("두 발로 직립보행 한다");
    }
}
