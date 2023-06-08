package exam03;

public class Box<T extends Fruit> { // Fruit, Apple, Melon
    private T item; // Fruit


    public void put(T item) { this.item = item; }

    public T get() { return item; }

    public void showInfo() { item.showInfo(); }
}
