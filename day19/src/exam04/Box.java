package exam04;

public class Box<T extends Fruit> {

    private T item;
    // private static T item2; // 사용불가
    // private T[] item = new T[]; // 사용불가
    public void put(T item){
        this.item = item;
    }
    public T get() {
        return item;
    }
    public void showInfo(){

    }

    // public static void method(T t) { } // 사용불가
}
