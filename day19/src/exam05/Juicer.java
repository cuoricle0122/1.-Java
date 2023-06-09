package exam05;

import java.util.ArrayList;

public class Juicer<T> {

    private T item;

    public static void make(FruitBox<? extends Fruit> appleBox){ // Fruit 클래스, Fruit 클래스의 하위 클래스 : 상한제한
        ArrayList<?> items = appleBox.get();
        System.out.println(items);
    }

    public static <T extends Fruit> void make2(FruitBox<T> fruitBox){
        ArrayList<T> items = fruitBox.get();
        System.out.println(items);
    }

}
