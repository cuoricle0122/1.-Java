package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box(); // Box class를 통해 appleBox를 생성
        appleBox.put(new Apple()); // AppleBox에 생성된 Apple객체를 넣음
        Apple apple = (Apple)appleBox.get(); // 다운캐스팅
        apple.showInfo();

        Box melonBox = new Box();
        melonBox.put(new Melon());
        Melon melon = (Melon)melonBox.get();
        melon.showInfo();
    }
}
