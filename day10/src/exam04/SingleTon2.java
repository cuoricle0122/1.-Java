package exam04;

public class SingleTon2 {
    // 싱글톤 작성하기 연습
    private static SingleTon2 instance;
    private SingleTon2(){};
    public static SingleTon2 getInstance(){
        if ( instance == null ){
            instance = new SingleTon2();
        }
        return instance;
    }
}
