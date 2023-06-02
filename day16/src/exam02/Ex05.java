package exam02;

public class Ex05 {
    public static void main(String[] args) {
        Integer num1 = new Integer(100); // JDK9
        Integer num2 = new Integer(100);
        System.out.println("num1 : " + System.identityHashCode(num1)); // num1 : 1915910607
        System.out.println("num2 : " + System.identityHashCode(num2)); // num2 : 1389133897
        // 오류 뜨는 이유 → 100이란 숫자를 가공하는데 필요한 객체가 여러개 필요없음

        Integer num3 = Integer.valueOf(100);
        Integer num4 = Integer.valueOf(100);
        System.out.println("num3 : " + System.identityHashCode(num3)); // num3 : 1915910607
        System.out.println("num4 : " + System.identityHashCode(num4)); // num4 : 1915910607

        Integer num5 = Integer.valueOf(10000000);
        Integer num6 = Integer.valueOf(10000000);
        System.out.println("num5 : " + System.identityHashCode(num5)); // num5 : 664223387
        System.out.println("num6 : " + System.identityHashCode(num6)); // num6 : 824909230
        // 값이 커지면 객체 주소값 달라짐
    }
}
