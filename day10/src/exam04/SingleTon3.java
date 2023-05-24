package exam04;

public class SingleTon3 {
    // 싱글톤 연습하기 3
    private static SingleTon3 instance;
    private SingleTon3(){};
    public static SingleTon3 getInstance(){
        if (instance == null){
            instance = new SingleTon3();
        }
        return instance;
    }
}
