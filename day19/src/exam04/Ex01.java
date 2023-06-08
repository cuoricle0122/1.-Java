package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>(); // 뒤에 Apple 생략가능
        appleBox.put(new Apple());
        Apple apple = appleBox.get();
        apple.showInfo();

        Box<Melon> melonBox = new Box<Melon>();
        melonBox.put(new Melon());
        Melon melon = melonBox.get();
        melon.showInfo();


    }
}
