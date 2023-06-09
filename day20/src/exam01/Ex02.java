package exam01;

import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");
        
        /*
        for(int i=0; i<names.size(); i++){
            names.remove(i); // 삭제될때마다 기존배열 버리고 새로 만듬
        }
        */
        
        for(int i = names.size()-1; i>=0; i--){
            names.remove(i); // 그래서 배열이 초기화되지않도록 뒤에서부터 삭제
        }
        for(String name:names){
            System.out.println(name);
        }
    }
}
