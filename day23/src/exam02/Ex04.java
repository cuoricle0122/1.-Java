package exam02;

public class Ex04 {
    public static void main(String[] args) {
        // MyLamda myLamda = s -> System.out.println(s); // 한개짜리일땐 가로 생략 가능
        // myLamda.print("abc");
        MyLamda myLamda = () -> System.out.println("ABC");
        myLamda.print();
    }
}
