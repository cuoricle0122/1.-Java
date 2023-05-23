package exam01;

public class Company2 { //싱글톤 패턴 연습
    private static Company2 instance;
    private Company2 () {};
    public static Company2 getInstance(){
        if ( instance == null ){
            instance = new Company2();
        }
        return instance;
    }
}
