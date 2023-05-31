package exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");

            // 예외가 없을때만 자원 해제
            fis.close(); // 자원 해제 - IOException
            System.out.println("자원해제 1");
        }catch (IOException e){
            e.printStackTrace();
            try {
                if (fis != null) {
                    fis.close(); // IOException // 예외가 있을때 자원 해제
                }
                System.out.println("자원해제 2");
            } catch(IOException e2){}
        }finally {

        }
        
        // fis.close() - 예외가 발생하든 안하든 항상 수행되는 부분
    }
}
