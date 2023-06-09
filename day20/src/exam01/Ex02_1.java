package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex02_1 {
    public static void main(String[] args) {
        // ArrayList<String> names = new ArrayList<>(); → 조회할때 빠름 
        // LinkedList<String> names = new LinkedList<>(); → 수정, 삭제할때 빠름
        List<String> names = new ArrayList<>(); // 다형성을 이용해 List 사용하여 필요할때 뒤에만 변경
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        Iterator<String> iter = names.iterator();
        while(iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
        System.out.println("---------------------------------------");

        while(iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
    }
}
