package exam04;

public class Ex01 {
    public static void main(String[] args){
        try(MyResource myResource = new MyResource()){

        } catch (Exception e){
            e.printStackTrace();
        }

        // try ~ with ~ resource 구문 AutoCloseable 구현 객체의 close 메서드를
        // 예외가 있던없던 간에 마지막 close() 메서드를 호출
    }
}
