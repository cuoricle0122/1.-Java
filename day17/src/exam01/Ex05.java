package exam01;

import java.util.StringTokenizer;

public class Ex05 {
    public static void main(String[] args) {
        String fruits = "Apple, Mango# Banana_ Melon";
        StringTokenizer st = new StringTokenizer(fruits, ",#_");
        while(st.hasMoreElements()){
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
