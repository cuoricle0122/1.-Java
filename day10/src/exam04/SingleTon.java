package exam04;

public class SingleTon {
    // 싱글톤 작성방법 연습
    private static SingleTon instance;
    private SingleTon(){};
    public static SingleTon getInstance(){
        if ( instance == null){
            instance = new SingleTon();
        }
        return instance;
    }
}
