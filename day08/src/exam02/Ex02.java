package exam02;

public class Ex02 {
    public static void main(String[] args){
        Student.id = 1000;
        System.out.println(Student.id); // 1000

        Class cls = Student.class;

        Student.staticMethod(); // 정적메서드

    }
}
