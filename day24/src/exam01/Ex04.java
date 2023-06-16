package exam01;

import java.util.Optional;

public class Ex04 {
    public static void main(String[] args) {
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
        Book book2 = opt.orElseGet(() -> new Book());
        System.out.println(book2);
    }
}
