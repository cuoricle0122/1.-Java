package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 100;
        s1.subject = "dd";

        int result1 = add(10, 20);
        System.out.println(result1);

        int result2 = add(20, 30);
        System.out.println(result2);
    }

    static int add(int num1, int num2){
        int num3 = num1+num2; // 연산 구조(수행되는 내용)는 바뀌지 않음, 재료만 바뀜
        return num3;
    }
}
