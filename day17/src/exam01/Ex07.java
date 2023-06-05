package exam01;

public class Ex07 {
    public static void main(String[] args) {
        String fruits = "Apple,Orange,Mango,Melon,Apple";

        int index = fruits.indexOf("Mango"); // 시작하는 위치
        System.out.println(index);

        int index2 = fruits.indexOf("Mango2"); // 없는 단어
        System.out.println(index2); // -1 반환

        int index3 = fruits.indexOf("Apple");
        System.out.println("indexOf : " + index3); // 0

        int index4 = fruits.lastIndexOf("Apple");
        System.out.println("lastIndexOf : " + index4); // 25
    }
}
